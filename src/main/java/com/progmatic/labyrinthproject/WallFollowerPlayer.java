package com.progmatic.labyrinthproject;

import com.progmatic.labyrinthproject.enums.Direction;
import com.progmatic.labyrinthproject.interfaces.Labyrinth;
import com.progmatic.labyrinthproject.interfaces.Player;

public class WallFollowerPlayer implements Player {
    public WallFollowerPlayer(boolean b) {
    }

    @Override
    public Direction nextMove(Labyrinth l) {
        return null;
    }
}
