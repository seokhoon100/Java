package Week10;

// 부모 클래스
class Game {
    protected String title;
    protected String version;

    public Game(String title, String version) {
        this.title = title;
        this.version = version;
    }

    public void start() {
        System.out.println("제목: " + title);
        System.out.println("버전: " + version);
        System.out.println(title + "게임을 시작합니다.");
    }
}

// LOL 클래스
class LOL extends Game {
    public LOL() {
        super("롤", "13.0");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("리그 오브 레전드는 세계 최고의 MOBA(Multiplayer Online Battle Arena) 게임입니다.");
    }
}

// Tetris 클래스
class Tetris extends Game {
    public Tetris() {
        super("테트리스", "12.5");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("테트리스(Tetris)는 퍼즐 게임으로, 소련의 프로그래머 알렉세이 파지트노프가 처음 디자인하고 프로그래밍 한 게임이다.");
    }
}

// SuperMario 클래스
class SuperMario extends Game {
    public SuperMario() {
        super("슈퍼 마리오", "1.0");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("슈퍼 마리오 시리즈는 닌텐도의 대표적인 플랫폼 게임입니다.");
    }
}

// 실행 클래스
public class Homework {
    public static void main(String[] args) {
        Game lol = new LOL();
        lol.start();
        System.out.println();

        Game tetris = new Tetris();
        tetris.start();
        System.out.println();

        Game mario = new SuperMario();
        mario.start();
    }
}
