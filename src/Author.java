public class Author {
    private String name;
    private String secondName;

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;

    }



    public String getName() {
        return this.name;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
