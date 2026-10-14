package cb;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.c;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import ed.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends WebViewClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3670b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PhDeleteAccountActivity f3671a;

    public a(PhDeleteAccountActivity phDeleteAccountActivity) {
        this.f3671a = phDeleteAccountActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (u.x(String.valueOf(str), "submitted.formspark.io", false, 2)) {
            this.f3671a.setResult(1347566);
            PhDeleteAccountActivity phDeleteAccountActivity = this.f3671a;
            phDeleteAccountActivity.f28396e.postDelayed(new c(phDeleteAccountActivity), 800L);
        }
    }
}
