package y6;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import com.inscode.autoclicker.service.ClickService;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends AccessibilityService.GestureResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClickService f38185a;

    public e(ClickService clickService) {
        this.f38185a = clickService;
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public void onCancelled(GestureDescription gestureDescription) {
        super.onCancelled(gestureDescription);
        ClickService clickService = this.f38185a;
        ClickService.a aVar = ClickService.f13099n;
        clickService.c().a();
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public void onCompleted(GestureDescription gestureDescription) {
        super.onCompleted(gestureDescription);
        ClickService clickService = this.f38185a;
        ClickService.a aVar = ClickService.f13099n;
        clickService.c().a();
    }
}
