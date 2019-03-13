package ee.valiit.kasutajatelist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.sql.rowset.CachedRowSet;
import java.util.ArrayList;

@CrossOrigin
@RestController
public class APIController {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @PostMapping("/list")
    public void handleNewListItem(@RequestBody Kasutaja kasutaja) {
        System.out.println("handleNewListItem");
        System.out.println("Kasutaja nimi: " + kasutaja.getNimi());
        String sqlKask = "INSERT INTO kasutajad (nimi, vanus) VALUES ('"
                + kasutaja.getNimi() + "', " + kasutaja.getVanus() + ");";
        jdbcTemplate.execute(sqlKask);
        System.out.println("Sisestamine õnnestus.");
    }

    @GetMapping("/tulemus")
    ArrayList<Kasutaja> kasutaja() {
        try {
            String sqlKask = "SELECT * FROM kasutajad;";
            ArrayList<Kasutaja> kasutaja = (ArrayList) jdbcTemplate.queryForList(sqlKask);
            System.out.println(kasutaja);
            return kasutaja;
        } catch (DataAccessException err) {
            System.out.println("TABLE WAS NOT READY");
            return new ArrayList();
        }
    }




}
