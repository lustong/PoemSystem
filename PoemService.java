import java.util.ArrayList;
import java.util.List;

public class PoemService {
    private List<User> userList;
    private List<Poem> poemList;

    public PoemService() {
        userList = new ArrayList<>();
        poemList = new ArrayList<>();
        initData();
    }

    // 初始化模拟数据
    private void initData() {
        userList.add(new User(1, "student", "123456", "诗词学习者"));
        userList.add(new User(2, "admin", "admin666", "系统管理员"));

        poemList.add(new Poem(1, "静夜思", "李白", "唐代",
                "床前明月光，疑是地上霜。\n举头望明月，低头思故乡。",
                "诗人客居他乡时的思乡之作"));
        poemList.add(new Poem(2, "春晓", "孟浩然", "唐代",
                "春眠不觉晓，处处闻啼鸟。\n夜来风雨声，花落知多少。",
                "描绘春日清晨的优美景象"));
    }

    // 用户登录
    public User login(String username, String password) {
        for (User u : userList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    // 获取全部诗词
    public List<Poem> getAllPoems() {
        return poemList;
    }

    // 按名称搜索诗词
    public Poem searchPoem(String keyword) {
        for (Poem p : poemList) {
            if (p.getTitle().contains(keyword)) {
                return p;
            }
        }
        return null;
    }
}