package y6;

import com.inscode.autoclicker.service.ClickService;
import com.inscode.autoclicker.ui.main.TurnOffService;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClickService f38188c;

    public f(ClickService clickService) {
        this.f38188c = clickService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClickService clickService = this.f38188c;
        ClickService.a aVar = ClickService.f13099n;
        clickService.c().d(TurnOffService.INSTANCE);
    }
}
