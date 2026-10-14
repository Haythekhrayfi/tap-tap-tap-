package cb;

import android.webkit.WebView;
import androidx.activity.f;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PhDeleteAccountActivity f3672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PhDeleteAccountActivity phDeleteAccountActivity) {
        super(true);
        this.f3672d = phDeleteAccountActivity;
    }

    @Override // androidx.activity.f
    public void a() {
        WebView webView = this.f3672d.f28394c;
        if (webView == null) {
            j0.r("webView");
            throw null;
        }
        if (!webView.canGoBack()) {
            b(false);
            this.f3672d.getOnBackPressedDispatcher().b();
            return;
        }
        WebView webView2 = this.f3672d.f28394c;
        if (webView2 != null) {
            webView2.goBack();
        } else {
            j0.r("webView");
            throw null;
        }
    }
}
