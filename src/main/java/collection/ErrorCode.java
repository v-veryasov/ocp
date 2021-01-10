package collection;

public enum ErrorCode {

    /**
     * ОШИБКИ НА ВСЕ <code>СООБЩЕНИЯ</code>
     */
    PMSE("Превышение максимального размера пакета"),

    CE_001("В заголовке запроса не задан или задан пустой токен-ключ пользователя"),

    CE_002("Не задан сертификат информационной системы-отправителя в справочнике ИС на ЕИС"),

    CE_003("Токен-ключ пользователя в заголовке запроса имеет неверный формат"),

    CE_004("У токен-ключа пользователя указанного в заголовке запроса истек срок действия.");

    private String text;

    private ErrorCode(String text) {
        this.text = text;
    }

    public String getDescription() {
        return name();
    }

    public String toString() {
        return name();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
