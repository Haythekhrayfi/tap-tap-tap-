package oa;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: oa.a$a, reason: collision with other inner class name */
    public static final class C0376a {
        public static String a(a aVar, String str, String str2) {
            j0.i(str, Action.KEY_ATTRIBUTE);
            j0.i(str2, "default");
            return (String) aVar.d(aVar, str, str2);
        }

        public static boolean b(a aVar, String str, boolean z10) {
            j0.i(str, Action.KEY_ATTRIBUTE);
            return ((Boolean) aVar.d(aVar, str, Boolean.valueOf(z10))).booleanValue();
        }
    }

    boolean a(String str, boolean z10);

    String b();

    Map<String, String> c();

    boolean contains(String str);

    <T> T d(a aVar, String str, T t10);
}
