package q0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34766a;

    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f34767a;

        public a(d dVar) {
            this.f34767a = dVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            q0.c cVarA = this.f34767a.a(i10);
            if (cVarA == null) {
                return null;
            }
            return cVarA.f34746a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            Objects.requireNonNull(this.f34767a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f34767a.c(i10, i11, bundle);
        }
    }

    public static class b extends a {
        public b(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            q0.c cVarB = this.f34767a.b(i10);
            if (cVarB == null) {
                return null;
            }
            return cVarB.f34746a;
        }
    }

    public static class c extends b {
        public c(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f34767a);
        }
    }

    public d() {
        this.f34766a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public d(Object obj) {
        this.f34766a = obj;
    }

    public q0.c a(int i10) {
        return null;
    }

    public q0.c b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }
}
