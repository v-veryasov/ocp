package pattern.st.composite;

public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
