public class Archive {
    private String name;
    private String code;

    public Archive(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return code + ": " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Archive)) {
            return false;
        }

        Archive nArchive = (Archive) obj;
        return nArchive.code.equals(this.code);
    }
}
