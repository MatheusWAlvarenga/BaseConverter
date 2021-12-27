package baseconverter.model;

/**
 *
 * @author MatheusWilliam
 */
public class Bases {

    public static boolean contains(Bases teste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int id;
    private String base;
    
    public Bases(int id, String base){
        this.id = id;
        this.base = base;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return getBase();
    }
}
