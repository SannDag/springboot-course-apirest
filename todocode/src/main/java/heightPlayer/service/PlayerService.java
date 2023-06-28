package heightPlayer.service;

import heightPlayer.entity.Player;
import heightPlayer.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> addPlayers(List<Player> players) {
        playerRepository.addAllPlayers(players);
        return players;
    }

}
