package razerdp.github.com.lib.manager.localphoto;

/**
 * Created by liushaoming on 2017/3/23.
 */

public class LPException extends Exception {

    public LPException(String r) {
        this(r, null);
    }

    public LPException(String message, Exception cause) {
        super(message, cause);
    }
}
