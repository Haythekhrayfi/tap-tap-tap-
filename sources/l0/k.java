package l0;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
