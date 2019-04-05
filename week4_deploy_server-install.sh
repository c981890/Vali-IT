# ctrl + d kombinatsioon on logout.

##########################
# FRESH SERVER FIRST RUN #
##########################

ssh root@138.68.76.179   # Ühendu serverisse, et parool seadistada
mkdir -m 777 app          # Loo eraldi kaust oma äppi jaoks
# logout

#####################
# KOHALIKUS ARVUTIS #
#####################
# Asukoht: projekti kaust (seal kus on gradlew fail)
# Tööriist: Git Bash

chmod +x gradlew          # Anna õigus faili käivitada
./gradlew bootjar         # Kompileeri projekt kasutades gradle't
scp build/libs/*.jar root@138.68.76.179:/root/app/app.jar # Uploadi kompileeritud jar serverisse

############
# SERVERIS #
############

# Installi tarkvara
ssh root@138.68.76.179   # Logi sisse serverisse
apt-get update            # Uuenda Ubuntu kanalid
apt-get install postgresql postgresql-contrib openjdk-11-jre # Installi PostgreSQL ja Java 11

# SEADISTA ANDMEBAAS
sudo -i -u postgres       # Võta postgres kasutaja roll
psql                      # Mine andmebaasi käsureale
\password                 # Määra parooliks "postgres"
# logout * 2, et oleksid jälle 'root' kasutaja

# KÄIVITA SERVER
cd app                    # Liigu äppi kausta sisse (cd on "change directory")
wget https://gitlab.com/KristerV/valiit-kursus/raw/master/week4/deploy/run_server.sh # Lae alla käivitamise script
chmod +x run_server.sh    # Anna õigus fail käivitada
./run_server.sh           # Käivita server
less log.txt              # Vaata logist kas server läks käima
                          # Scroll on üles/alla nool või Page up/Page down
less errors.txt           # Kontrolli, et erroreid ei oleks siia faili tekkinud
						  # Välja saad nupuga 'q'
						
###########################################
# SERVERI UUENDAMINE JÄRGNEVATEL KORDADEL #
###########################################

./gradlew bootjar
scp build/libs/*.jar root@138.68.76.179:/root/app/app.jar
ssh root@138.68.76.179
cd app
rm *.txt              # kustuta logi failid
./run_server.sh
less errors.txt



# Kui tahad turvata oma serverit peaksid
# 1. Käivitama serveri mitte-root kasutaja alt
# 2. Käivitama firewalli: https://www.digitalocean.com/community/tutorials/how-to-set-up-a-firewall-with-ufw-on-ubuntu-18-04