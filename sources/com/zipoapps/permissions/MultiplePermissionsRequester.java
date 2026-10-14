package com.zipoapps.permissions;

import android.app.Activity;
import android.app.Application;
import androidx.activity.result.b;
import androidx.appcompat.app.AppCompatActivity;
import fd.j0;
import gb.c;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiplePermissionsRequester extends BasePermissionRequester {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f28235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b<String[]> f28236f;

    public static final class a extends gb.b {
        public a() {
        }

        @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            j0.i(activity, "activity");
            j0.i(activity, "activity");
            MultiplePermissionsRequester multiplePermissionsRequester = MultiplePermissionsRequester.this;
            c cVar = multiplePermissionsRequester.f28235e;
            if (cVar != null) {
                Objects.requireNonNull(multiplePermissionsRequester);
                Application application = activity.getApplication();
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(cVar);
                }
                multiplePermissionsRequester.f28236f.c();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiplePermissionsRequester(AppCompatActivity appCompatActivity, String[] strArr) {
        w wVar;
        super(appCompatActivity);
        j0.i(appCompatActivity, "activity");
        j0.i(strArr, "permissions");
        b<String[]> bVarRegisterForActivityResult = appCompatActivity.registerForActivityResult(new c.b(), new d0.a(this));
        j0.h(bVarRegisterForActivityResult, "activity.registerForActi…nResult(result)\n        }");
        this.f28236f = bVarRegisterForActivityResult;
        this.f28235e = new c(appCompatActivity.getClass(), new a());
        Application application = appCompatActivity.getApplication();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.f28235e);
            wVar = w.f31842a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            xe.a.f37601c.b("Initialization of MultiplePermissionsRequester should be done when host activity had already created", new Object[0]);
        }
    }

    @Override // com.zipoapps.permissions.BasePermissionRequester
    public b<?> h() {
        return this.f28236f;
    }
}
