public class Song {
    enum Genre {
        POP, CLASSIC, ROCK, RAP, FOLK, JAZZ, BLUES, UNKNOWN
    }
    private final String singer;
    private final String title;
    private final double duration;
    private final String lyricist;
    private final String composer;
    private final String cover;
    private final Genre genre;

    public static class Builder {
        // required parameters
        private final String title;
        private final double duration;

        // optional parameters, set to default
        private String singer = "Unknown";
        private String lyricist = "Unknown";
        private String composer = "Unknown";
        private String cover = "Unknown";
        private Genre genre = Genre.UNKNOWN;

        public Builder(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public Builder singer(String val) {
            this.singer = val; return this;
        }

        public Builder lyricist(String val) {
            this.lyricist = val; return this;
        }

        public Builder composer(String val) {
            this.composer = composer; return this;
        }

        public Builder cover(String val) {
            this.cover = val; return this;
        }

        public Builder genre(Genre val) {
            this.genre = val; return this;
        }

        public Song build() {
            return new Song(this);
        }
    }

    private Song(Builder builder) {
        this.singer = builder.singer;
        this.title = builder.title;
        this.duration = builder.duration;
        this.lyricist = builder.lyricist;
        this.composer = builder.composer;
        this.cover = builder.cover;
        this.genre = builder.genre;
    }
}
