public class abstractFactory01 {

    private King king;
    private Castle castle;
    private Army army;

    /**
     * Creates kingdom
     */
    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    public King getKing() {
        return king;
    }

    private void setKing(final King king) {
        this.king = king;
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    public Castle getCastle() {
        return castle;
    }

    private void setCastle(final Castle castle) {
        this.castle = castle;
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public Army getArmy() {
        return army;
    }

    private void setArmy(final Army army) {
        this.army = army;
    }

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        abstractFactory01 app = new abstractFactory01();

        System.out.println("Elf Kingdom");
        app.createKingdom(new ElfKingdomFactory());
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

        System.out.println("\nOrc Kingdom");
        app.createKingdom(new OrcKingdomFactory());
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

    }

}

interface Army {

    String getDescription();
}

interface Castle {

    String getDescription();
}

class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

class ElfCastle implements Castle {

    static final String DESCRIPTION = "This is the Elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

class ElfKingdomFactory implements KingdomFactory {

    public Castle createCastle() {
        return new ElfCastle();
    }

    public King createKing() {
        return new ElfKing();
    }

    public Army createArmy() {
        return new ElfArmy();
    }

}

interface King {

    String getDescription();
}

interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();

}

class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

class OrcCastle implements Castle {

    static final String DESCRIPTION = "This is the Orc castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

class OrcKing implements King {

    static final String DESCRIPTION = "This is the Orc king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

class OrcKingdomFactory implements KingdomFactory {

    public Castle createCastle() {
        return new OrcCastle();
    }

    public King createKing() {
        return new OrcKing();
    }

    public Army createArmy() {
        return new OrcArmy();
    }
}

class ElfKing implements King {

    static final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
