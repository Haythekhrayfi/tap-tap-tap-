package d6;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends Exception {
    public x(String str) {
        super(str);
        if (str == null) {
            return;
        }
        Objects.requireNonNull(str.toLowerCase(Locale.US));
    }
}
