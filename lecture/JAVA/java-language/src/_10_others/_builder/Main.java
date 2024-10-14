package _10_others._builder;

public class Main {
    public static void main(String[] args) {
        // 빌더 패턴을 안쓰고 생성자를 통해 객체 생성시 예시
        // Student std = new Student("John", 10, 1, "LA");

        Computer basicComputer = new Computer.ComputerBuilder("Intel i5")
                .setRam(8)
                .setStorage(256)
                .build();
        System.out.println("basicComputer = " + basicComputer);

        Computer gamingComputer = new Computer.ComputerBuilder("AMD Ryzen 7")
                .setStorage(1000)
                .setRam(32)
                .setGpu("NVIDIA RTX 3080")
                .build();
        System.out.println("gamingComputer = " + gamingComputer);
    }
}

