/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/4/25 -  - 25 - 13:21
 * {@code @Description:} com.studentCode
 */
public class User {
    private String username;
    private String password;
    private String cord;
    private String phonenumber;

    public User() {
    }

    public User(String username, String password, String cord, String phonenumber) {
        this.username = username;
        this.password = password;
        this.cord = cord;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCord() {
        return cord;
    }

    public void setCord(String cord) {
        this.cord = cord;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
