public enum MenuItems {
    SAVE("save", 1),
    FIND("find", 2),
    DELETE("delete", 3),
    EDIT("edit", 4);

    private final String name;

    private final Integer number;

    MenuItems(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
