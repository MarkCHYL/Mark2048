package com.game.show.mark2048;

/**
 * Created by mark on 2017/11/14.
 * $desc$ 坐标实体类
 * Mail: 2285581945@qq.com
 */

public class Cell {
    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
