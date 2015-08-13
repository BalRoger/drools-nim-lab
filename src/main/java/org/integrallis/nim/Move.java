package org.integrallis.nim;

import java.util.Random;

public enum Move {
    TAKE_ONE(1),
    TAKE_TWO(2),
    TAKE_THREE(3);

    private Move(Integer howMany) { this.howMany = howMany; }

	public Integer getHowMany() { return howMany; }

	private Integer howMany;

	public static Move get(int move) {
		switch (move) {
			case 1: return TAKE_ONE;
			case 2: return TAKE_TWO;
			case 3: return TAKE_THREE;
			default: return get(new Random().nextInt(3) + 1);
		}
	}
}
