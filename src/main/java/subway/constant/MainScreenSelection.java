package subway.constant;

public enum MainScreenSelection {
    ONE("1", "역 관리"),
    TWO("2", "노선 관리"),
    THREE("3", "구간 관리"),
    FOUR("4", "지하철 노선도 출력"),
    QUIT("Q", "종료");

    private final String selection;
    private final String content;

    MainScreenSelection(String selection, String content) {
        this.selection = selection;
        this.content = content;
    }

    public String getSelection() {
        return selection;
    }

    public String getContent() {
        return content;
    }
}