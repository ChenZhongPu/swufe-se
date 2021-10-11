class Post {
    private String content;
    private State state;

    public Post() {
        content = "";
        state = new Draft();
    }

    public String getContent() {
        return this.state.content(this.content);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void requestReview() {
        this.state = this.state.requestReview();
    }

    public void approve() {
        this.state = this.state.approve();
    }
}

interface State {
    State requestReview();
    State approve();

    default String content(String c) {
        return "";
    }
}

class Draft implements State {

    @Override
    public State requestReview() {
        return new PendingReview();
    }

    @Override
    public State approve() {
        return this;
    }
}

class PendingReview implements State {

    @Override
    public State requestReview() {
        return this;
    }

    @Override
    public State approve() {
        return new Published();
    }
}

class Published implements State {

    @Override
    public State requestReview() {
        return this;
    }

    @Override
    public State approve() {
        return this;
    }

    @Override
    public String content(String c) {
        return c;
    }
}

public class PostMain {
    public static void main(String[] args) {
        Post post = new Post();
        post.setContent("Hello China");
        assert post.getContent().equals("");
        post.requestReview();
        assert (post.getContent().equals(""));
        post.approve();
        assert post.getContent().equals("Hello China");
    }
}
