abstract class Course {
    public void deliver() {
        System.out.println("发布资料");
    }

    public void ppt() {
        System.out.println("制作ppt");
    }

    public void video() {
        System.out.println("在线直播");
    }

    public void assign() {
        System.out.println("布置作业");
        if (check()) {
            System.out.println("检查作业");
        }
    }

    public void uploadHomework() {
        System.out.println("上传作业");
    }

    boolean check() {
        return true;
    }
}

class needcheck extends Course {
    @Override
    boolean check() {
        return true;
    }
}


class checkless extends Course {

}


public class Main {
    public static void main(String[] args) {
        // check
        System.out.println("needcheck homework:");
        Course course1 = new needcheck();
        course1.deliver();
        course1.ppt();
        course1.video();
        course1.assign();
        course1.uploadHomework();


        // checkless
        System.out.println("checkless homework:");
        Course course2 = new checkless();
        course2.deliver();
        course2.ppt();
        course2.video();
        course2.assign();
        course2.uploadHomework();

    }
}