package ch07.HideDelegate;

public class Person {
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Person manager = new Person();
        Department marketing = new Department(manager);
        manager.setDepartment(marketing);

        Person john = new Person();
        john.setDepartment(marketing);

        // 어떤 사람의 팀장이 누구인지 알려면
        john.getDepartment().getManager();
        //이렇게 해야함,
    }
}
