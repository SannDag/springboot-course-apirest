package heightPlayer.controller;

import heightPlayer.entity.Player;
import heightPlayer.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/players")
    public Double createPlayersList(@RequestBody List<Player> players){
        double height = 0.0;
        double average = 0.0;

        List<Player> addedPlayers = playerService.addPlayers(players);

        for (Player i : addedPlayers){
            height += i.getHeight();
        }

        average += height / addedPlayers.size();

        return average;
    }

}
