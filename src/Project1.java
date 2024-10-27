import java.util.Objects;

public class Project1 {
    int sum;
    String name;

    public Project1(int sum, String name) {
        this.sum = sum;
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project1 project1 = (Project1) o;
        return sum == project1.sum && Objects.equals(name, project1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, name);
    }

    @Override
    public String toString() {
        return "Project1{" +
                "sum=" + sum +
                ", name='" + name + '\'' +
                '}';
    }
}
