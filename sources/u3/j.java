package u3;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import fd.j0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j implements Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f35986h = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a3.j f35987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<FragmentManager, i> f35988d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<androidx.fragment.app.FragmentManager, m> f35989e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f35990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f35991g;

    public class a implements b {
    }

    public interface b {
    }

    public j(b bVar) {
        new q.a();
        new q.a();
        new Bundle();
        this.f35991g = bVar == null ? f35986h : bVar;
        this.f35990f = new Handler(Looper.getMainLooper(), this);
    }

    public a3.j a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (b4.j.h() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.n) {
                return b((androidx.fragment.app.n) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (b4.j.g()) {
                    return a(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                i iVarC = c(activity.getFragmentManager(), null, !activity.isFinishing());
                a3.j jVar = iVarC.f35982f;
                if (jVar != null) {
                    return jVar;
                }
                a3.c cVarB = a3.c.b(activity);
                b bVar = this.f35991g;
                u3.a aVar = iVarC.f35979c;
                k kVar = iVarC.f35980d;
                Objects.requireNonNull((a) bVar);
                a3.j jVar2 = new a3.j(cVarB, aVar, kVar, activity);
                iVarC.f35982f = jVar2;
                return jVar2;
            }
            if (context instanceof ContextWrapper) {
                return a(((ContextWrapper) context).getBaseContext());
            }
        }
        if (this.f35987c == null) {
            synchronized (this) {
                if (this.f35987c == null) {
                    a3.c cVarB2 = a3.c.b(context.getApplicationContext());
                    b bVar2 = this.f35991g;
                    j0 j0Var = new j0(4);
                    z.c cVar = new z.c(2);
                    Context applicationContext = context.getApplicationContext();
                    Objects.requireNonNull((a) bVar2);
                    this.f35987c = new a3.j(cVarB2, j0Var, cVar, applicationContext);
                }
            }
        }
        return this.f35987c;
    }

    public a3.j b(androidx.fragment.app.n nVar) {
        if (b4.j.g()) {
            return a(nVar.getApplicationContext());
        }
        if (nVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        m mVarD = d(nVar.getSupportFragmentManager(), null, !nVar.isFinishing());
        a3.j jVar = mVarD.f35999g;
        if (jVar != null) {
            return jVar;
        }
        a3.c cVarB = a3.c.b(nVar);
        b bVar = this.f35991g;
        u3.a aVar = mVarD.f35995c;
        k kVar = mVarD.f35996d;
        Objects.requireNonNull((a) bVar);
        a3.j jVar2 = new a3.j(cVarB, aVar, kVar, nVar);
        mVarD.f35999g = jVar2;
        return jVar2;
    }

    public final i c(FragmentManager fragmentManager, Fragment fragment, boolean z10) {
        i iVar = (i) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (iVar == null && (iVar = this.f35988d.get(fragmentManager)) == null) {
            iVar = new i();
            iVar.f35984h = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                iVar.a(fragment.getActivity());
            }
            if (z10) {
                iVar.f35979c.d();
            }
            this.f35988d.put(fragmentManager, iVar);
            fragmentManager.beginTransaction().add(iVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f35990f.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return iVar;
    }

    public final m d(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z10) {
        m mVar = (m) fragmentManager.F("com.bumptech.glide.manager");
        if (mVar == null && (mVar = this.f35989e.get(fragmentManager)) == null) {
            mVar = new m();
            mVar.f36000h = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                mVar.b(fragment.getActivity());
            }
            if (z10) {
                mVar.f35995c.d();
            }
            this.f35989e.put(fragmentManager, mVar);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.e(0, mVar, "com.bumptech.glide.manager", 1);
            aVar.j();
            this.f35990f.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return mVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i10 = message.what;
        Object objRemove = null;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                z10 = false;
                obj2 = null;
            } else {
                obj = (androidx.fragment.app.FragmentManager) message.obj;
                map = this.f35989e;
            }
            if (z10 && objRemove == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z10;
        }
        obj = (FragmentManager) message.obj;
        map = this.f35988d;
        Object obj3 = obj;
        objRemove = map.remove(obj);
        obj2 = obj3;
        if (z10) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z10;
    }
}
