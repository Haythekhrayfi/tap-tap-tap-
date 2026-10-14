package okhttp3;

import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinEventParameters;
import fd.j0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        j0.i(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        j0.i(str2, "password");
        return basic$default(str, str2, null, 4, null);
    }

    public static final String basic(String str, String str2, Charset charset) {
        j0.i(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        j0.i(str2, "password");
        j0.i(charset, "charset");
        return j0.p("Basic ", g.f34892f.c(str + CoreConstants.COLON_CHAR + str2, charset).a());
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            j0.h(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }
}
