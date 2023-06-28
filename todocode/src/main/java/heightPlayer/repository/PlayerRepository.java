package heightPlayer.repository;

import dependencyInjection.model.Post;
import heightPlayer.entity.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {

    //simulated database
    private List<Player> playersDatabase = new ArrayList<>();

    public List<Player> getAllPlayers() {
        return playersDatabase;
    }

    public void addAllPlayers(List<Player> players) {
        playersDatabase.addAll(players);
    }

}
