package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.widget.r0;
import androidx.lifecycle.o0;
import com.inscode.autoclicker.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public androidx.activity.result.b<Intent> A;
    public androidx.activity.result.b<IntentSenderRequest> B;
    public androidx.activity.result.b<String[]> C;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList<androidx.fragment.app.a> J;
    public ArrayList<Boolean> K;
    public ArrayList<Fragment> L;
    public y M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1900b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f1902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f1903e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f1905g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0.a<Configuration> f1913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0.a<Integer> f1914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0.a<d0.m> f1915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0.a<d0.e0> f1916r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s<?> f1919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f1920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Fragment f1921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Fragment f1922x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<m> f1899a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f1901c = new c0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f1904f = new t(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.activity.f f1906h = new b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1907i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, BackStackState> f1908j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<String, Bundle> f1909k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, l> f1910l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f1911m = new u(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList<z> f1912n = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p0.n f1917s = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1918t = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r f1923y = new d();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m0 f1924z = new e(this);
    public ArrayDeque<LaunchedFragmentInfo> D = new ArrayDeque<>();
    public Runnable N = new f();

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1930d;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f1929c = parcel.readString();
            this.f1930d = parcel.readInt();
        }

        public LaunchedFragmentInfo(String str, int i10) {
            this.f1929c = str;
            this.f1930d = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1929c);
            parcel.writeInt(this.f1930d);
        }
    }

    public class a implements androidx.activity.result.a<Map<String, Boolean>> {
        public a() {
        }

        @Override // androidx.activity.result.a
        @SuppressLint({"SyntheticAccessor"})
        public void a(Map<String, Boolean> map) {
            StringBuilder sbA;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.D.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                sbA = new StringBuilder();
                sbA.append("No permissions were requested for ");
                sbA.append(this);
            } else {
                String str = launchedFragmentInfoPollFirst.f1929c;
                int i11 = launchedFragmentInfoPollFirst.f1930d;
                Fragment fragmentD = FragmentManager.this.f1901c.d(str);
                if (fragmentD != null) {
                    fragmentD.onRequestPermissionsResult(i11, strArr, iArr);
                    return;
                }
                sbA = android.support.v4.media.c.a("Permission request result delivered for unknown Fragment ", str);
            }
            Log.w("FragmentManager", sbA.toString());
        }
    }

    public class b extends androidx.activity.f {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.f
        public void a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.A(true);
            if (fragmentManager.f1906h.f496a) {
                fragmentManager.T();
            } else {
                fragmentManager.f1905g.b();
            }
        }
    }

    public class c implements p0.n {
        public c() {
        }

        @Override // p0.n
        public boolean a(MenuItem menuItem) {
            return FragmentManager.this.p(menuItem);
        }

        @Override // p0.n
        public void b(Menu menu) {
            FragmentManager.this.q(menu);
        }

        @Override // p0.n
        public void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.k(menu, menuInflater);
        }

        @Override // p0.n
        public void d(Menu menu) {
            FragmentManager.this.t(menu);
        }
    }

    public class d extends r {
        public d() {
        }

        @Override // androidx.fragment.app.r
        public Fragment a(ClassLoader classLoader, String str) {
            s<?> sVar = FragmentManager.this.f1919u;
            Context context = sVar.f2109d;
            Objects.requireNonNull(sVar);
            return Fragment.instantiate(context, str, null);
        }
    }

    public class e implements m0 {
        public e(FragmentManager fragmentManager) {
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.A(true);
        }
    }

    public class g implements z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f1936c;

        public g(FragmentManager fragmentManager, Fragment fragment) {
            this.f1936c = fragment;
        }

        @Override // androidx.fragment.app.z
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f1936c.onAttachFragment(fragment);
        }
    }

    public class h implements androidx.activity.result.a<ActivityResult> {
        public h() {
        }

        @Override // androidx.activity.result.a
        public void a(ActivityResult activityResult) {
            StringBuilder sbA;
            ActivityResult activityResult2 = activityResult;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.D.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                sbA = new StringBuilder();
                sbA.append("No Activities were started for result for ");
                sbA.append(this);
            } else {
                String str = launchedFragmentInfoPollFirst.f1929c;
                int i10 = launchedFragmentInfoPollFirst.f1930d;
                Fragment fragmentD = FragmentManager.this.f1901c.d(str);
                if (fragmentD != null) {
                    fragmentD.onActivityResult(i10, activityResult2.f501c, activityResult2.f502d);
                    return;
                }
                sbA = android.support.v4.media.c.a("Activity result delivered for unknown Fragment ", str);
            }
            Log.w("FragmentManager", sbA.toString());
        }
    }

    public class i implements androidx.activity.result.a<ActivityResult> {
        public i() {
        }

        @Override // androidx.activity.result.a
        public void a(ActivityResult activityResult) {
            StringBuilder sbA;
            ActivityResult activityResult2 = activityResult;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.D.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                sbA = new StringBuilder();
                sbA.append("No IntentSenders were started for ");
                sbA.append(this);
            } else {
                String str = launchedFragmentInfoPollFirst.f1929c;
                int i10 = launchedFragmentInfoPollFirst.f1930d;
                Fragment fragmentD = FragmentManager.this.f1901c.d(str);
                if (fragmentD != null) {
                    fragmentD.onActivityResult(i10, activityResult2.f501c, activityResult2.f502d);
                    return;
                }
                sbA = android.support.v4.media.c.a("Intent Sender result delivered for unknown Fragment ", str);
            }
            Log.w("FragmentManager", sbA.toString());
        }
    }

    public static class j extends c.a<IntentSenderRequest, ActivityResult> {
        @Override // c.a
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f526d;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.b bVar = new IntentSenderRequest.b(intentSenderRequest2.f525c);
                    bVar.f530b = null;
                    int i10 = intentSenderRequest2.f528f;
                    int i11 = intentSenderRequest2.f527e;
                    bVar.f532d = i10;
                    bVar.f531c = i11;
                    intentSenderRequest2 = new IntentSenderRequest(bVar.f529a, null, i11, i10);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // c.a
        public ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static abstract class k {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    public static class l implements a0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.lifecycle.i f1939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a0 f1940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.lifecycle.n f1941e;

        public l(androidx.lifecycle.i iVar, a0 a0Var, androidx.lifecycle.n nVar) {
            this.f1939c = iVar;
            this.f1940d = a0Var;
            this.f1941e = nVar;
        }

        @Override // androidx.fragment.app.a0
        public void b(String str, Bundle bundle) {
            this.f1940d.b(str, bundle);
        }
    }

    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class n implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1943b;

        public n(String str, int i10, int i11) {
            this.f1942a = i10;
            this.f1943b = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f1922x;
            if (fragment == null || this.f1942a >= 0 || !fragment.getChildFragmentManager().T()) {
                return FragmentManager.this.V(arrayList, arrayList2, null, this.f1942a, this.f1943b);
            }
            return false;
        }
    }

    public FragmentManager() {
        final int i10 = 0;
        this.f1913o = new o0.a(this, i10) { // from class: androidx.fragment.app.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f2119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f2120b;

            {
                this.f2119a = i10;
                if (i10 != 1) {
                }
                this.f2120b = this;
            }

            @Override // o0.a
            public final void accept(Object obj) {
                switch (this.f2119a) {
                    case 0:
                        FragmentManager fragmentManager = this.f2120b;
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.M()) {
                            fragmentManager.h(configuration, false);
                        }
                        break;
                    case 1:
                        FragmentManager fragmentManager2 = this.f2120b;
                        Integer num = (Integer) obj;
                        if (fragmentManager2.M() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        FragmentManager fragmentManager3 = this.f2120b;
                        d0.m mVar = (d0.m) obj;
                        if (fragmentManager3.M()) {
                            fragmentManager3.n(mVar.f28537a, false);
                        }
                        break;
                    default:
                        FragmentManager fragmentManager4 = this.f2120b;
                        d0.e0 e0Var = (d0.e0) obj;
                        if (fragmentManager4.M()) {
                            fragmentManager4.s(e0Var.f28502a, false);
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f1914p = new o0.a(this, i11) { // from class: androidx.fragment.app.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f2119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f2120b;

            {
                this.f2119a = i11;
                if (i11 != 1) {
                }
                this.f2120b = this;
            }

            @Override // o0.a
            public final void accept(Object obj) {
                switch (this.f2119a) {
                    case 0:
                        FragmentManager fragmentManager = this.f2120b;
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.M()) {
                            fragmentManager.h(configuration, false);
                        }
                        break;
                    case 1:
                        FragmentManager fragmentManager2 = this.f2120b;
                        Integer num = (Integer) obj;
                        if (fragmentManager2.M() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        FragmentManager fragmentManager3 = this.f2120b;
                        d0.m mVar = (d0.m) obj;
                        if (fragmentManager3.M()) {
                            fragmentManager3.n(mVar.f28537a, false);
                        }
                        break;
                    default:
                        FragmentManager fragmentManager4 = this.f2120b;
                        d0.e0 e0Var = (d0.e0) obj;
                        if (fragmentManager4.M()) {
                            fragmentManager4.s(e0Var.f28502a, false);
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f1915q = new o0.a(this, i12) { // from class: androidx.fragment.app.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f2119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f2120b;

            {
                this.f2119a = i12;
                if (i12 != 1) {
                }
                this.f2120b = this;
            }

            @Override // o0.a
            public final void accept(Object obj) {
                switch (this.f2119a) {
                    case 0:
                        FragmentManager fragmentManager = this.f2120b;
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.M()) {
                            fragmentManager.h(configuration, false);
                        }
                        break;
                    case 1:
                        FragmentManager fragmentManager2 = this.f2120b;
                        Integer num = (Integer) obj;
                        if (fragmentManager2.M() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        FragmentManager fragmentManager3 = this.f2120b;
                        d0.m mVar = (d0.m) obj;
                        if (fragmentManager3.M()) {
                            fragmentManager3.n(mVar.f28537a, false);
                        }
                        break;
                    default:
                        FragmentManager fragmentManager4 = this.f2120b;
                        d0.e0 e0Var = (d0.e0) obj;
                        if (fragmentManager4.M()) {
                            fragmentManager4.s(e0Var.f28502a, false);
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f1916r = new o0.a(this, i13) { // from class: androidx.fragment.app.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f2119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f2120b;

            {
                this.f2119a = i13;
                if (i13 != 1) {
                }
                this.f2120b = this;
            }

            @Override // o0.a
            public final void accept(Object obj) {
                switch (this.f2119a) {
                    case 0:
                        FragmentManager fragmentManager = this.f2120b;
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.M()) {
                            fragmentManager.h(configuration, false);
                        }
                        break;
                    case 1:
                        FragmentManager fragmentManager2 = this.f2120b;
                        Integer num = (Integer) obj;
                        if (fragmentManager2.M() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        FragmentManager fragmentManager3 = this.f2120b;
                        d0.m mVar = (d0.m) obj;
                        if (fragmentManager3.M()) {
                            fragmentManager3.n(mVar.f28537a, false);
                        }
                        break;
                    default:
                        FragmentManager fragmentManager4 = this.f2120b;
                        d0.e0 e0Var = (d0.e0) obj;
                        if (fragmentManager4.M()) {
                            fragmentManager4.s(e0Var.f28502a, false);
                        }
                        break;
                }
            }
        };
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public boolean A(boolean z10) {
        boolean zA;
        z(z10);
        boolean z11 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.J;
            ArrayList<Boolean> arrayList2 = this.K;
            synchronized (this.f1899a) {
                if (this.f1899a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f1899a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zA |= this.f1899a.get(i10).a(arrayList, arrayList2);
                        }
                        this.f1899a.clear();
                        this.f1919u.f2110e.removeCallbacks(this.N);
                    } catch (Throwable th) {
                        this.f1899a.clear();
                        this.f1919u.f2110e.removeCallbacks(this.N);
                        throw th;
                    }
                }
            }
            if (!zA) {
                m0();
                v();
                this.f1901c.b();
                return z11;
            }
            this.f1900b = true;
            try {
                Y(this.J, this.K);
                d();
                z11 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    public void B(m mVar, boolean z10) {
        if (z10 && (this.f1919u == null || this.H)) {
            return;
        }
        z(z10);
        ((androidx.fragment.app.a) mVar).a(this.J, this.K);
        this.f1900b = true;
        try {
            Y(this.J, this.K);
            d();
            m0();
            v();
            this.f1901c.b();
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    public final void C(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<androidx.fragment.app.a> arrayList3;
        int i12;
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        Fragment fragment;
        int i13;
        boolean z10;
        ArrayList<androidx.fragment.app.a> arrayList4 = arrayList;
        boolean z11 = arrayList4.get(i10).f2020p;
        ArrayList<Fragment> arrayList5 = this.L;
        if (arrayList5 == null) {
            this.L = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.L.addAll(this.f1901c.h());
        Fragment fragment2 = this.f1922x;
        boolean z12 = false;
        int i14 = i10;
        while (true) {
            int i15 = 1;
            if (i14 >= i11) {
                this.L.clear();
                if (z11 || this.f1918t < 1) {
                    arrayList3 = arrayList;
                    i12 = i11;
                } else {
                    int i16 = i10;
                    i12 = i11;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i16 < i12) {
                            Iterator<e0.a> it = arrayList3.get(i16).f2005a.iterator();
                            while (it.hasNext()) {
                                Fragment fragment3 = it.next().f2022b;
                                if (fragment3 != null && fragment3.mFragmentManager != null) {
                                    this.f1901c.i(f(fragment3));
                                }
                            }
                            i16++;
                        }
                    }
                }
                for (int i17 = i10; i17 < i12; i17++) {
                    androidx.fragment.app.a aVar = arrayList3.get(i17);
                    if (arrayList2.get(i17).booleanValue()) {
                        aVar.i(-1);
                        boolean z13 = true;
                        int size = aVar.f2005a.size() - 1;
                        while (size >= 0) {
                            e0.a aVar2 = aVar.f2005a.get(size);
                            Fragment fragment4 = aVar2.f2022b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(z13);
                                int i18 = aVar.f2010f;
                                int i19 = 4100;
                                if (i18 == 4097) {
                                    i19 = 8194;
                                } else if (i18 == 8194) {
                                    i19 = 4097;
                                } else if (i18 != 8197) {
                                    i19 = i18 != 4099 ? i18 != 4100 ? 0 : 8197 : 4099;
                                }
                                fragment4.setNextTransition(i19);
                                fragment4.setSharedElementNames(aVar.f2019o, aVar.f2018n);
                            }
                            switch (aVar2.f2021a) {
                                case 1:
                                    fragment4.setAnimations(aVar2.f2024d, aVar2.f2025e, aVar2.f2026f, aVar2.f2027g);
                                    aVar.f1967q.c0(fragment4, true);
                                    aVar.f1967q.X(fragment4);
                                    size--;
                                    z13 = true;
                                    break;
                                case 2:
                                default:
                                    StringBuilder sbA = defpackage.a.a("Unknown cmd: ");
                                    sbA.append(aVar2.f2021a);
                                    throw new IllegalArgumentException(sbA.toString());
                                case 3:
                                    fragment4.setAnimations(aVar2.f2024d, aVar2.f2025e, aVar2.f2026f, aVar2.f2027g);
                                    aVar.f1967q.a(fragment4);
                                    size--;
                                    z13 = true;
                                    break;
                                case 4:
                                    fragment4.setAnimations(aVar2.f2024d, aVar2.f2025e, aVar2.f2026f, aVar2.f2027g);
                                    aVar.f1967q.i0(fragment4);
                                    size--;
                                    z13 = true;
                                    break;
                                case 5:
                                    fragment4.setAnimations(aVar2.f2024d, aVar2.f2025e, aVar2.f2026f, aVar2.f2027g);
                                    aVar.f1967q.c0(fragment4, true);
                                    aVar.f1967q.J(fragment4);
                                    size--;
                                    z13 = true;
                                    break;
                                case 6:
                                    fragment4.setAnimations(aVar2.f2024d, aVar2.f2025e, aVar2.f2026f, aVar2.f2027g);
                                    aVar.f1967q.c(fragment4);
                                    size--;
                                    z13 = true;
                                    break;
                                case 7:
                                    fragment4.setAnimations(aVar2.f2024d, aVar2.f2025e, aVar2.f2026f, aVar2.f2027g);
                                    aVar.f1967q.c0(fragment4, true);
                                    aVar.f1967q.g(fragment4);
                                    size--;
                                    z13 = true;
                                    break;
                                case 8:
                                    fragmentManager2 = aVar.f1967q;
                                    fragment4 = null;
                                    fragmentManager2.g0(fragment4);
                                    size--;
                                    z13 = true;
                                    break;
                                case 9:
                                    fragmentManager2 = aVar.f1967q;
                                    fragmentManager2.g0(fragment4);
                                    size--;
                                    z13 = true;
                                    break;
                                case 10:
                                    aVar.f1967q.f0(fragment4, aVar2.f2028h);
                                    size--;
                                    z13 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar.i(1);
                        int size2 = aVar.f2005a.size();
                        for (int i20 = 0; i20 < size2; i20++) {
                            e0.a aVar3 = aVar.f2005a.get(i20);
                            Fragment fragment5 = aVar3.f2022b;
                            if (fragment5 != null) {
                                fragment5.mBeingSaved = false;
                                fragment5.setPopDirection(false);
                                fragment5.setNextTransition(aVar.f2010f);
                                fragment5.setSharedElementNames(aVar.f2018n, aVar.f2019o);
                            }
                            switch (aVar3.f2021a) {
                                case 1:
                                    fragment5.setAnimations(aVar3.f2024d, aVar3.f2025e, aVar3.f2026f, aVar3.f2027g);
                                    aVar.f1967q.c0(fragment5, false);
                                    aVar.f1967q.a(fragment5);
                                    break;
                                case 2:
                                default:
                                    StringBuilder sbA2 = defpackage.a.a("Unknown cmd: ");
                                    sbA2.append(aVar3.f2021a);
                                    throw new IllegalArgumentException(sbA2.toString());
                                case 3:
                                    fragment5.setAnimations(aVar3.f2024d, aVar3.f2025e, aVar3.f2026f, aVar3.f2027g);
                                    aVar.f1967q.X(fragment5);
                                    break;
                                case 4:
                                    fragment5.setAnimations(aVar3.f2024d, aVar3.f2025e, aVar3.f2026f, aVar3.f2027g);
                                    aVar.f1967q.J(fragment5);
                                    break;
                                case 5:
                                    fragment5.setAnimations(aVar3.f2024d, aVar3.f2025e, aVar3.f2026f, aVar3.f2027g);
                                    aVar.f1967q.c0(fragment5, false);
                                    aVar.f1967q.i0(fragment5);
                                    break;
                                case 6:
                                    fragment5.setAnimations(aVar3.f2024d, aVar3.f2025e, aVar3.f2026f, aVar3.f2027g);
                                    aVar.f1967q.g(fragment5);
                                    break;
                                case 7:
                                    fragment5.setAnimations(aVar3.f2024d, aVar3.f2025e, aVar3.f2026f, aVar3.f2027g);
                                    aVar.f1967q.c0(fragment5, false);
                                    aVar.f1967q.c(fragment5);
                                    break;
                                case 8:
                                    fragmentManager = aVar.f1967q;
                                    fragmentManager.g0(fragment5);
                                    break;
                                case 9:
                                    fragmentManager = aVar.f1967q;
                                    fragment5 = null;
                                    fragmentManager.g0(fragment5);
                                    break;
                                case 10:
                                    aVar.f1967q.f0(fragment5, aVar3.f2029i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i12 - 1).booleanValue();
                for (int i21 = i10; i21 < i12; i21++) {
                    androidx.fragment.app.a aVar4 = arrayList3.get(i21);
                    if (zBooleanValue) {
                        for (int size3 = aVar4.f2005a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = aVar4.f2005a.get(size3).f2022b;
                            if (fragment6 != null) {
                                f(fragment6).k();
                            }
                        }
                    } else {
                        Iterator<e0.a> it2 = aVar4.f2005a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().f2022b;
                            if (fragment7 != null) {
                                f(fragment7).k();
                            }
                        }
                    }
                }
                Q(this.f1918t, true);
                HashSet<l0> hashSet = new HashSet();
                for (int i22 = i10; i22 < i12; i22++) {
                    Iterator<e0.a> it3 = arrayList3.get(i22).f2005a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().f2022b;
                        if (fragment8 != null && (viewGroup = fragment8.mContainer) != null) {
                            hashSet.add(l0.g(viewGroup, I()));
                        }
                    }
                }
                for (l0 l0Var : hashSet) {
                    l0Var.f2079d = zBooleanValue;
                    l0Var.h();
                    l0Var.c();
                }
                for (int i23 = i10; i23 < i12; i23++) {
                    androidx.fragment.app.a aVar5 = arrayList3.get(i23);
                    if (arrayList2.get(i23).booleanValue() && aVar5.f1969s >= 0) {
                        aVar5.f1969s = -1;
                    }
                    Objects.requireNonNull(aVar5);
                }
                return;
            }
            androidx.fragment.app.a aVar6 = arrayList4.get(i14);
            int i24 = 3;
            if (arrayList2.get(i14).booleanValue()) {
                ArrayList<Fragment> arrayList6 = this.L;
                int size4 = aVar6.f2005a.size() - 1;
                while (size4 >= 0) {
                    e0.a aVar7 = aVar6.f2005a.get(size4);
                    int i25 = aVar7.f2021a;
                    if (i25 == i15) {
                        arrayList6.remove(aVar7.f2022b);
                    } else if (i25 != 3) {
                        switch (i25) {
                            case 6:
                                arrayList6.add(aVar7.f2022b);
                                break;
                            case 7:
                                arrayList6.remove(aVar7.f2022b);
                                break;
                            case 8:
                                fragment = null;
                                fragment2 = fragment;
                                break;
                            case 9:
                                fragment = aVar7.f2022b;
                                fragment2 = fragment;
                                break;
                            case 10:
                                aVar7.f2029i = aVar7.f2028h;
                                break;
                        }
                    } else {
                        arrayList6.add(aVar7.f2022b);
                    }
                    size4--;
                    i15 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList7 = this.L;
                int i26 = 0;
                while (i26 < aVar6.f2005a.size()) {
                    e0.a aVar8 = aVar6.f2005a.get(i26);
                    int i27 = aVar8.f2021a;
                    if (i27 == i15) {
                        arrayList7.add(aVar8.f2022b);
                    } else {
                        if (i27 == 2) {
                            Fragment fragment9 = aVar8.f2022b;
                            int i28 = fragment9.mContainerId;
                            int size5 = arrayList7.size() - 1;
                            boolean z14 = false;
                            while (size5 >= 0) {
                                Fragment fragment10 = arrayList7.get(size5);
                                if (fragment10.mContainerId != i28) {
                                    i28 = i28;
                                } else if (fragment10 == fragment9) {
                                    z14 = true;
                                    i28 = i28;
                                } else {
                                    if (fragment10 == fragment2) {
                                        z10 = true;
                                        aVar6.f2005a.add(i26, new e0.a(9, fragment10, true));
                                        i26++;
                                        fragment2 = null;
                                    } else {
                                        z10 = true;
                                    }
                                    e0.a aVar9 = new e0.a(3, fragment10, z10);
                                    aVar9.f2024d = aVar8.f2024d;
                                    aVar9.f2026f = aVar8.f2026f;
                                    aVar9.f2025e = aVar8.f2025e;
                                    aVar9.f2027g = aVar8.f2027g;
                                    aVar6.f2005a.add(i26, aVar9);
                                    arrayList7.remove(fragment10);
                                    i26++;
                                }
                                size5--;
                                i28 = i28;
                            }
                            if (z14) {
                                aVar6.f2005a.remove(i26);
                                i26--;
                            } else {
                                i13 = 1;
                                aVar8.f2021a = 1;
                                aVar8.f2023c = true;
                                arrayList7.add(fragment9);
                            }
                            i15 = i13;
                        } else if (i27 == i24 || i27 == 6) {
                            arrayList7.remove(aVar8.f2022b);
                            Fragment fragment11 = aVar8.f2022b;
                            if (fragment11 == fragment2) {
                                aVar6.f2005a.add(i26, new e0.a(9, fragment11));
                                i26++;
                                fragment2 = null;
                                i15 = 1;
                            }
                        } else if (i27 == 7) {
                            i15 = 1;
                            arrayList7.add(aVar8.f2022b);
                        } else if (i27 == 8) {
                            aVar6.f2005a.add(i26, new e0.a(9, fragment2, true));
                            aVar8.f2023c = true;
                            i26++;
                            fragment2 = aVar8.f2022b;
                        }
                        i13 = 1;
                        i15 = i13;
                    }
                    i26 += i15;
                    i24 = 3;
                }
            }
            z12 = z12 || aVar6.f2011g;
            i14++;
            arrayList4 = arrayList;
        }
    }

    public Fragment D(String str) {
        return this.f1901c.c(str);
    }

    public Fragment E(int i10) {
        c0 c0Var = this.f1901c;
        int size = c0Var.f1994a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (b0 b0Var : c0Var.f1995b.values()) {
                    if (b0Var != null) {
                        Fragment fragment = b0Var.f1984c;
                        if (fragment.mFragmentId == i10) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = c0Var.f1994a.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i10) {
                return fragment2;
            }
        }
    }

    public Fragment F(String str) {
        c0 c0Var = this.f1901c;
        Objects.requireNonNull(c0Var);
        int size = c0Var.f1994a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (b0 b0Var : c0Var.f1995b.values()) {
                    if (b0Var != null) {
                        Fragment fragment = b0Var.f1984c;
                        if (str.equals(fragment.mTag)) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = c0Var.f1994a.get(size);
            if (fragment2 != null && str.equals(fragment2.mTag)) {
                return fragment2;
            }
        }
    }

    public final ViewGroup G(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f1920v.c()) {
            View viewB = this.f1920v.b(fragment.mContainerId);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    public r H() {
        Fragment fragment = this.f1921w;
        return fragment != null ? fragment.mFragmentManager.H() : this.f1923y;
    }

    public m0 I() {
        Fragment fragment = this.f1921w;
        return fragment != null ? fragment.mFragmentManager.I() : this.f1924z;
    }

    public void J(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        h0(fragment);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean L(Fragment fragment) {
        boolean z10;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mChildFragmentManager;
        boolean zL = false;
        for (Fragment fragment2 : (ArrayList) fragmentManager.f1901c.f()) {
            if (fragment2 != null) {
                zL = fragmentManager.L(fragment2);
            }
            if (zL) {
                z10 = true;
                if (z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (z10) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        Fragment fragment = this.f1921w;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f1921w.getParentFragmentManager().M();
    }

    public boolean N(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f1922x) && O(fragmentManager.f1921w);
    }

    public boolean P() {
        return this.F || this.G;
    }

    public void Q(int i10, boolean z10) {
        s<?> sVar;
        if (this.f1919u == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f1918t) {
            this.f1918t = i10;
            c0 c0Var = this.f1901c;
            Iterator<Fragment> it = c0Var.f1994a.iterator();
            while (it.hasNext()) {
                b0 b0Var = c0Var.f1995b.get(it.next().mWho);
                if (b0Var != null) {
                    b0Var.k();
                }
            }
            Iterator<b0> it2 = c0Var.f1995b.values().iterator();
            while (true) {
                boolean z11 = false;
                if (!it2.hasNext()) {
                    break;
                }
                b0 next = it2.next();
                if (next != null) {
                    next.k();
                    Fragment fragment = next.f1984c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z11 = true;
                    }
                    if (z11) {
                        if (fragment.mBeingSaved && !c0Var.f1996c.containsKey(fragment.mWho)) {
                            next.p();
                        }
                        c0Var.j(next);
                    }
                }
            }
            j0();
            if (this.E && (sVar = this.f1919u) != null && this.f1918t == 7) {
                sVar.h();
                this.E = false;
            }
        }
    }

    public void R() {
        if (this.f1919u == null) {
            return;
        }
        this.F = false;
        this.G = false;
        this.M.f2127f = false;
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void S(b0 b0Var) {
        Fragment fragment = b0Var.f1984c;
        if (fragment.mDeferStart) {
            if (this.f1900b) {
                this.I = true;
            } else {
                fragment.mDeferStart = false;
                b0Var.k();
            }
        }
    }

    public boolean T() {
        return U(null, -1, 0);
    }

    public final boolean U(String str, int i10, int i11) {
        A(false);
        z(true);
        Fragment fragment = this.f1922x;
        if (fragment != null && i10 < 0 && fragment.getChildFragmentManager().T()) {
            return true;
        }
        boolean zV = V(this.J, this.K, null, i10, i11);
        if (zV) {
            this.f1900b = true;
            try {
                Y(this.J, this.K);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        m0();
        v();
        this.f1901c.b();
        return zV;
    }

    public boolean V(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1902d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str != null || i10 >= 0) {
                int size2 = this.f1902d.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1902d.get(size2);
                    if ((str != null && str.equals(aVar.f2013i)) || (i10 >= 0 && i10 == aVar.f1969s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z10) {
                        while (size2 > 0) {
                            int i12 = size2 - 1;
                            androidx.fragment.app.a aVar2 = this.f1902d.get(i12);
                            if ((str == null || !str.equals(aVar2.f2013i)) && (i10 < 0 || i10 != aVar2.f1969s)) {
                                break;
                            }
                            size2 = i12;
                        }
                    } else if (size2 != this.f1902d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            } else {
                size = z10 ? 0 : (-1) + this.f1902d.size();
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f1902d.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.f1902d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void W(k kVar, boolean z10) {
        this.f1911m.f2115a.add(new u.a(kVar, z10));
    }

    public void X(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f1901c.k(fragment);
            if (L(fragment)) {
                this.E = true;
            }
            fragment.mRemoving = true;
            h0(fragment);
        }
    }

    public final void Y(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f2020p) {
                if (i11 != i10) {
                    C(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2020p) {
                        i11++;
                    }
                }
                C(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            C(arrayList, arrayList2, i11, size);
        }
    }

    public void Z(Parcelable parcelable) {
        int i10;
        b0 b0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1919u.f2109d.getClassLoader());
                this.f1909k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1919u.f2109d.getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        c0 c0Var = this.f1901c;
        c0Var.f1996c.clear();
        for (FragmentState fragmentState : arrayList) {
            c0Var.f1996c.put(fragmentState.f1954d, fragmentState);
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f1901c.f1995b.clear();
        Iterator<String> it = fragmentManagerState.f1945c.iterator();
        while (it.hasNext()) {
            FragmentState fragmentStateL = this.f1901c.l(it.next(), null);
            if (fragmentStateL != null) {
                Fragment fragment = this.M.f2122a.get(fragmentStateL.f1954d);
                if (fragment != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    b0Var = new b0(this.f1911m, this.f1901c, fragment, fragmentStateL);
                } else {
                    b0Var = new b0(this.f1911m, this.f1901c, this.f1919u.f2109d.getClassLoader(), H(), fragmentStateL);
                }
                Fragment fragment2 = b0Var.f1984c;
                fragment2.mFragmentManager = this;
                if (K(2)) {
                    StringBuilder sbA = defpackage.a.a("restoreSaveState: active (");
                    sbA.append(fragment2.mWho);
                    sbA.append("): ");
                    sbA.append(fragment2);
                    Log.v("FragmentManager", sbA.toString());
                }
                b0Var.m(this.f1919u.f2109d.getClassLoader());
                this.f1901c.i(b0Var);
                b0Var.f1986e = this.f1918t;
            }
        }
        y yVar = this.M;
        Objects.requireNonNull(yVar);
        Iterator it2 = new ArrayList(yVar.f2122a.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if ((this.f1901c.f1995b.get(fragment3.mWho) != null ? 1 : 0) == 0) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f1945c);
                }
                this.M.u(fragment3);
                fragment3.mFragmentManager = this;
                b0 b0Var2 = new b0(this.f1911m, this.f1901c, fragment3);
                b0Var2.f1986e = 1;
                b0Var2.k();
                fragment3.mRemoving = true;
                b0Var2.k();
            }
        }
        c0 c0Var2 = this.f1901c;
        ArrayList<String> arrayList2 = fragmentManagerState.f1946d;
        c0Var2.f1994a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                Fragment fragmentC = c0Var2.c(str3);
                if (fragmentC == null) {
                    throw new IllegalStateException(androidx.activity.j.a("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentC);
                }
                c0Var2.a(fragmentC);
            }
        }
        if (fragmentManagerState.f1947e != null) {
            this.f1902d = new ArrayList<>(fragmentManagerState.f1947e.length);
            int i11 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f1947e;
                if (i11 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i11];
                Objects.requireNonNull(backStackRecordState);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.f1843c;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    e0.a aVar2 = new e0.a();
                    int i14 = i12 + 1;
                    aVar2.f2021a = iArr[i12];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + backStackRecordState.f1843c[i14]);
                    }
                    aVar2.f2028h = androidx.lifecycle.i.c.values()[backStackRecordState.f1845e[i13]];
                    aVar2.f2029i = androidx.lifecycle.i.c.values()[backStackRecordState.f1846f[i13]];
                    int[] iArr2 = backStackRecordState.f1843c;
                    int i15 = i14 + 1;
                    aVar2.f2023c = iArr2[i14] != 0;
                    int i16 = i15 + 1;
                    int i17 = iArr2[i15];
                    aVar2.f2024d = i17;
                    int i18 = i16 + 1;
                    int i19 = iArr2[i16];
                    aVar2.f2025e = i19;
                    int i20 = i18 + 1;
                    int i21 = iArr2[i18];
                    aVar2.f2026f = i21;
                    int i22 = iArr2[i20];
                    aVar2.f2027g = i22;
                    aVar.f2006b = i17;
                    aVar.f2007c = i19;
                    aVar.f2008d = i21;
                    aVar.f2009e = i22;
                    aVar.b(aVar2);
                    i13++;
                    i12 = i20 + 1;
                }
                aVar.f2010f = backStackRecordState.f1847g;
                aVar.f2013i = backStackRecordState.f1848h;
                aVar.f2011g = true;
                aVar.f2014j = backStackRecordState.f1850j;
                aVar.f2015k = backStackRecordState.f1851k;
                aVar.f2016l = backStackRecordState.f1852l;
                aVar.f2017m = backStackRecordState.f1853m;
                aVar.f2018n = backStackRecordState.f1854n;
                aVar.f2019o = backStackRecordState.f1855o;
                aVar.f2020p = backStackRecordState.f1856p;
                aVar.f1969s = backStackRecordState.f1849i;
                for (int i23 = 0; i23 < backStackRecordState.f1844d.size(); i23++) {
                    String str4 = backStackRecordState.f1844d.get(i23);
                    if (str4 != null) {
                        aVar.f2005a.get(i23).f2022b = this.f1901c.c(str4);
                    }
                }
                aVar.i(1);
                if (K(2)) {
                    StringBuilder sbA2 = r0.a("restoreAllState: back stack #", i11, " (index ");
                    sbA2.append(aVar.f1969s);
                    sbA2.append("): ");
                    sbA2.append(aVar);
                    Log.v("FragmentManager", sbA2.toString());
                    PrintWriter printWriter = new PrintWriter(new k0("FragmentManager"));
                    aVar.l("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1902d.add(aVar);
                i11++;
            }
        } else {
            this.f1902d = null;
        }
        this.f1907i.set(fragmentManagerState.f1948f);
        String str5 = fragmentManagerState.f1949g;
        if (str5 != null) {
            Fragment fragmentC2 = this.f1901c.c(str5);
            this.f1922x = fragmentC2;
            r(fragmentC2);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f1950h;
        if (arrayList3 != null) {
            for (i10 = 0; i10 < arrayList3.size(); i10++) {
                this.f1908j.put(arrayList3.get(i10), fragmentManagerState.f1951i.get(i10));
            }
        }
        this.D = new ArrayDeque<>(fragmentManagerState.f1952j);
    }

    public b0 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            b1.b.d(fragment, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        b0 b0VarF = f(fragment);
        fragment.mFragmentManager = this;
        this.f1901c.i(b0VarF);
        if (!fragment.mDetached) {
            this.f1901c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (L(fragment)) {
                this.E = true;
            }
        }
        return b0VarF;
    }

    public Bundle a0() {
        int i10;
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = ((HashSet) e()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            l0 l0Var = (l0) it.next();
            if (l0Var.f2080e) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                l0Var.f2080e = false;
                l0Var.c();
            }
        }
        x();
        A(true);
        this.F = true;
        this.M.f2127f = true;
        c0 c0Var = this.f1901c;
        Objects.requireNonNull(c0Var);
        ArrayList<String> arrayList2 = new ArrayList<>(c0Var.f1995b.size());
        for (b0 b0Var : c0Var.f1995b.values()) {
            if (b0Var != null) {
                Fragment fragment = b0Var.f1984c;
                b0Var.p();
                arrayList2.add(fragment.mWho);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        c0 c0Var2 = this.f1901c;
        Objects.requireNonNull(c0Var2);
        ArrayList<FragmentState> arrayList3 = new ArrayList(c0Var2.f1996c.values());
        if (!arrayList3.isEmpty()) {
            c0 c0Var3 = this.f1901c;
            synchronized (c0Var3.f1994a) {
                backStackRecordStateArr = null;
                if (c0Var3.f1994a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(c0Var3.f1994a.size());
                    for (Fragment fragment2 : c0Var3.f1994a) {
                        arrayList.add(fragment2.mWho);
                        if (K(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.a> arrayList4 = this.f1902d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.f1902d.get(i10));
                    if (K(2)) {
                        StringBuilder sbA = r0.a("saveAllState: adding back stack #", i10, ": ");
                        sbA.append(this.f1902d.get(i10));
                        Log.v("FragmentManager", sbA.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f1945c = arrayList2;
            fragmentManagerState.f1946d = arrayList;
            fragmentManagerState.f1947e = backStackRecordStateArr;
            fragmentManagerState.f1948f = this.f1907i.get();
            Fragment fragment3 = this.f1922x;
            if (fragment3 != null) {
                fragmentManagerState.f1949g = fragment3.mWho;
            }
            fragmentManagerState.f1950h.addAll(this.f1908j.keySet());
            fragmentManagerState.f1951i.addAll(this.f1908j.values());
            fragmentManagerState.f1952j = new ArrayList<>(this.D);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f1909k.keySet()) {
                bundle.putBundle(i.f.a("result_", str), this.f1909k.get(str));
            }
            for (FragmentState fragmentState : arrayList3) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                StringBuilder sbA2 = defpackage.a.a("fragment_");
                sbA2.append(fragmentState.f1954d);
                bundle.putBundle(sbA2.toString(), bundle2);
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public void b(s<?> sVar, p pVar, Fragment fragment) {
        z gVar;
        y yVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String strA;
        Bundle bundleA;
        y yVar2;
        y yVar3;
        androidx.activity.h hVar;
        androidx.lifecycle.p pVar2;
        if (this.f1919u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1919u = sVar;
        this.f1920v = pVar;
        this.f1921w = fragment;
        if (fragment == null) {
            if (sVar instanceof z) {
                gVar = (z) sVar;
            }
            if (this.f1921w != null) {
                m0();
            }
            if (sVar instanceof androidx.activity.h) {
                hVar = (androidx.activity.h) sVar;
                OnBackPressedDispatcher onBackPressedDispatcher = hVar.getOnBackPressedDispatcher();
                this.f1905g = onBackPressedDispatcher;
                if (fragment != null) {
                    pVar2 = hVar;
                    pVar2 = fragment;
                }
                pVar2 = hVar;
                onBackPressedDispatcher.a(pVar2, this.f1906h);
            }
            if (fragment != null) {
                yVar2 = fragment.mFragmentManager.M;
                yVar3 = yVar2.f2123b.get(fragment.mWho);
                if (yVar3 == null) {
                    yVar3 = new y(yVar2.f2125d);
                    yVar2.f2123b.put(fragment.mWho, yVar3);
                }
                this.M = yVar3;
            } else {
                if (sVar instanceof o0) {
                    yVar = (y) new androidx.lifecycle.m0(((o0) sVar).getViewModelStore(), y.f2121g).a(y.class);
                } else {
                    yVar = new y(false);
                }
                this.M = yVar;
            }
            this.M.f2127f = P();
            this.f1901c.f1997d = this.M;
            obj = this.f1919u;
            if ((obj instanceof m1.d) && fragment == null) {
                m1.b savedStateRegistry = ((m1.d) obj).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new androidx.activity.d(this));
                bundleA = savedStateRegistry.a("android:support:fragments");
                if (bundleA != null) {
                    Z(bundleA);
                }
            }
            obj2 = this.f1919u;
            if (obj2 instanceof androidx.activity.result.d) {
                ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.d) obj2).getActivityResultRegistry();
                if (fragment != null) {
                    strA = androidx.activity.k.a(new StringBuilder(), fragment.mWho, ":");
                } else {
                    strA = "";
                }
                String strA2 = i.f.a("FragmentManager:", strA);
                this.A = activityResultRegistry.d(i.f.a(strA2, "StartActivityForResult"), new c.d(), new h());
                this.B = activityResultRegistry.d(i.f.a(strA2, "StartIntentSenderForResult"), new j(), new i());
                this.C = activityResultRegistry.d(i.f.a(strA2, "RequestPermissions"), new c.b(), new a());
            }
            obj3 = this.f1919u;
            if (obj3 instanceof e0.c) {
                ((e0.c) obj3).addOnConfigurationChangedListener(this.f1913o);
            }
            obj4 = this.f1919u;
            if (obj4 instanceof e0.d) {
                ((e0.d) obj4).addOnTrimMemoryListener(this.f1914p);
            }
            obj5 = this.f1919u;
            if (obj5 instanceof d0.b0) {
                ((d0.b0) obj5).addOnMultiWindowModeChangedListener(this.f1915q);
            }
            obj6 = this.f1919u;
            if (obj6 instanceof d0.c0) {
                ((d0.c0) obj6).addOnPictureInPictureModeChangedListener(this.f1916r);
            }
            obj7 = this.f1919u;
            if ((obj7 instanceof p0.i) || fragment != null) {
            }
            ((p0.i) obj7).addMenuProvider(this.f1917s);
            return;
        }
        gVar = new g(this, fragment);
        this.f1912n.add(gVar);
        if (this.f1921w != null) {
            m0();
        }
        if (sVar instanceof androidx.activity.h) {
            hVar = (androidx.activity.h) sVar;
            OnBackPressedDispatcher onBackPressedDispatcher2 = hVar.getOnBackPressedDispatcher();
            this.f1905g = onBackPressedDispatcher2;
            if (fragment != null) {
                pVar2 = hVar;
                pVar2 = fragment;
            }
            pVar2 = hVar;
            onBackPressedDispatcher2.a(pVar2, this.f1906h);
        }
        if (fragment != null) {
            yVar2 = fragment.mFragmentManager.M;
            yVar3 = yVar2.f2123b.get(fragment.mWho);
            if (yVar3 == null) {
                yVar3 = new y(yVar2.f2125d);
                yVar2.f2123b.put(fragment.mWho, yVar3);
            }
            this.M = yVar3;
        } else {
            if (sVar instanceof o0) {
                yVar = (y) new androidx.lifecycle.m0(((o0) sVar).getViewModelStore(), y.f2121g).a(y.class);
            } else {
                yVar = new y(false);
            }
            this.M = yVar;
        }
        this.M.f2127f = P();
        this.f1901c.f1997d = this.M;
        obj = this.f1919u;
        if (obj instanceof m1.d) {
            m1.b savedStateRegistry2 = ((m1.d) obj).getSavedStateRegistry();
            savedStateRegistry2.c("android:support:fragments", new androidx.activity.d(this));
            bundleA = savedStateRegistry2.a("android:support:fragments");
            if (bundleA != null) {
                Z(bundleA);
            }
        }
        obj2 = this.f1919u;
        if (obj2 instanceof androidx.activity.result.d) {
            ActivityResultRegistry activityResultRegistry2 = ((androidx.activity.result.d) obj2).getActivityResultRegistry();
            if (fragment != null) {
                strA = androidx.activity.k.a(new StringBuilder(), fragment.mWho, ":");
            } else {
                strA = "";
            }
            String strA3 = i.f.a("FragmentManager:", strA);
            this.A = activityResultRegistry2.d(i.f.a(strA3, "StartActivityForResult"), new c.d(), new h());
            this.B = activityResultRegistry2.d(i.f.a(strA3, "StartIntentSenderForResult"), new j(), new i());
            this.C = activityResultRegistry2.d(i.f.a(strA3, "RequestPermissions"), new c.b(), new a());
        }
        obj3 = this.f1919u;
        if (obj3 instanceof e0.c) {
            ((e0.c) obj3).addOnConfigurationChangedListener(this.f1913o);
        }
        obj4 = this.f1919u;
        if (obj4 instanceof e0.d) {
            ((e0.d) obj4).addOnTrimMemoryListener(this.f1914p);
        }
        obj5 = this.f1919u;
        if (obj5 instanceof d0.b0) {
            ((d0.b0) obj5).addOnMultiWindowModeChangedListener(this.f1915q);
        }
        obj6 = this.f1919u;
        if (obj6 instanceof d0.c0) {
            ((d0.c0) obj6).addOnPictureInPictureModeChangedListener(this.f1916r);
        }
        obj7 = this.f1919u;
        if (obj7 instanceof p0.i) {
        }
    }

    public void b0() {
        synchronized (this.f1899a) {
            boolean z10 = true;
            if (this.f1899a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1919u.f2110e.removeCallbacks(this.N);
                this.f1919u.f2110e.post(this.N);
                m0();
            }
        }
    }

    public void c(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f1901c.a(fragment);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (L(fragment)) {
                this.E = true;
            }
        }
    }

    public void c0(Fragment fragment, boolean z10) {
        ViewGroup viewGroupG = G(fragment);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z10);
    }

    public final void d() {
        this.f1900b = false;
        this.K.clear();
        this.J.clear();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final void d0(String str, Bundle bundle) {
        l lVar = this.f1910l.get(str);
        if (lVar != null) {
            if (lVar.f1939c.b().isAtLeast(androidx.lifecycle.i.c.STARTED)) {
                lVar.f1940d.b(str, bundle);
            } else {
                this.f1909k.put(str, bundle);
            }
        } else {
            this.f1909k.put(str, bundle);
        }
        if (K(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final Set<l0> e() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f1901c.e()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((b0) it.next()).f1984c.mContainer;
            if (viewGroup != null) {
                hashSet.add(l0.g(viewGroup, I()));
            }
        }
        return hashSet;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void e0(final String str, androidx.lifecycle.p pVar, final a0 a0Var) {
        final androidx.lifecycle.i lifecycle = pVar.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.i.c.DESTROYED) {
            return;
        }
        androidx.lifecycle.n nVar = new androidx.lifecycle.n() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.n
            public void g(androidx.lifecycle.p pVar2, androidx.lifecycle.i.b bVar) {
                Bundle bundle;
                if (bVar == androidx.lifecycle.i.b.ON_START && (bundle = FragmentManager.this.f1909k.get(str)) != null) {
                    a0Var.b(str, bundle);
                    FragmentManager fragmentManager = FragmentManager.this;
                    String str2 = str;
                    fragmentManager.f1909k.remove(str2);
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "Clearing fragment result with key " + str2);
                    }
                }
                if (bVar == androidx.lifecycle.i.b.ON_DESTROY) {
                    lifecycle.c(this);
                    FragmentManager.this.f1910l.remove(str);
                }
            }
        };
        lifecycle.a(nVar);
        l lVarPut = this.f1910l.put(str, new l(lifecycle, a0Var, nVar));
        if (lVarPut != null) {
            lVarPut.f1939c.c(lVarPut.f1941e);
        }
        if (K(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + a0Var);
        }
    }

    public b0 f(Fragment fragment) {
        b0 b0VarG = this.f1901c.g(fragment.mWho);
        if (b0VarG != null) {
            return b0VarG;
        }
        b0 b0Var = new b0(this.f1911m, this.f1901c, fragment);
        b0Var.m(this.f1919u.f2109d.getClassLoader());
        b0Var.f1986e = this.f1918t;
        return b0Var;
    }

    public void f0(Fragment fragment, androidx.lifecycle.i.c cVar) {
        if (fragment.equals(D(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void g(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f1901c.k(fragment);
            if (L(fragment)) {
                this.E = true;
            }
            h0(fragment);
        }
    }

    public void g0(Fragment fragment) {
        if (fragment == null || (fragment.equals(D(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f1922x;
            this.f1922x = fragment;
            r(fragment2);
            r(this.f1922x);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void h(Configuration configuration, boolean z10) {
        if (z10 && (this.f1919u instanceof e0.c)) {
            k0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.h(configuration, true);
                }
            }
        }
    }

    public final void h0(Fragment fragment) {
        ViewGroup viewGroupG = G(fragment);
        if (viewGroupG != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public boolean i(MenuItem menuItem) {
        if (this.f1918t < 1) {
            return false;
        }
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i0(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void j() {
        this.F = false;
        this.G = false;
        this.M.f2127f = false;
        u(1);
    }

    public final void j0() {
        Iterator it = ((ArrayList) this.f1901c.e()).iterator();
        while (it.hasNext()) {
            S((b0) it.next());
        }
    }

    public boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f1918t < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null && N(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f1903e != null) {
            for (int i10 = 0; i10 < this.f1903e.size(); i10++) {
                Fragment fragment2 = this.f1903e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1903e = arrayList;
        return z10;
    }

    public final void k0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new k0("FragmentManager"));
        s<?> sVar = this.f1919u;
        try {
            if (sVar != null) {
                sVar.d("  ", null, printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw runtimeException;
        }
    }

    public void l() {
        boolean zIsChangingConfigurations = true;
        this.H = true;
        A(true);
        x();
        s<?> sVar = this.f1919u;
        if (sVar instanceof o0) {
            zIsChangingConfigurations = this.f1901c.f1997d.f2126e;
        } else {
            Context context = sVar.f2109d;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it = this.f1908j.values().iterator();
            while (it.hasNext()) {
                for (String str : it.next().f1857c) {
                    y yVar = this.f1901c.f1997d;
                    Objects.requireNonNull(yVar);
                    if (K(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    yVar.t(str);
                }
            }
        }
        u(-1);
        Object obj = this.f1919u;
        if (obj instanceof e0.d) {
            ((e0.d) obj).removeOnTrimMemoryListener(this.f1914p);
        }
        Object obj2 = this.f1919u;
        if (obj2 instanceof e0.c) {
            ((e0.c) obj2).removeOnConfigurationChangedListener(this.f1913o);
        }
        Object obj3 = this.f1919u;
        if (obj3 instanceof d0.b0) {
            ((d0.b0) obj3).removeOnMultiWindowModeChangedListener(this.f1915q);
        }
        Object obj4 = this.f1919u;
        if (obj4 instanceof d0.c0) {
            ((d0.c0) obj4).removeOnPictureInPictureModeChangedListener(this.f1916r);
        }
        Object obj5 = this.f1919u;
        if (obj5 instanceof p0.i) {
            ((p0.i) obj5).removeMenuProvider(this.f1917s);
        }
        this.f1919u = null;
        this.f1920v = null;
        this.f1921w = null;
        if (this.f1905g != null) {
            Iterator<androidx.activity.a> it2 = this.f1906h.f497b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f1905g = null;
        }
        androidx.activity.result.b<Intent> bVar = this.A;
        if (bVar != null) {
            bVar.c();
            this.B.c();
            this.C.c();
        }
    }

    public void l0(k kVar) {
        u uVar = this.f1911m;
        synchronized (uVar.f2115a) {
            int size = uVar.f2115a.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (uVar.f2115a.get(i10).f2117a == kVar) {
                    uVar.f2115a.remove(i10);
                    break;
                }
            }
        }
    }

    public void m(boolean z10) {
        if (z10 && (this.f1919u instanceof e0.d)) {
            k0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void m0() {
        synchronized (this.f1899a) {
            if (!this.f1899a.isEmpty()) {
                this.f1906h.b(true);
                return;
            }
            androidx.activity.f fVar = this.f1906h;
            ArrayList<androidx.fragment.app.a> arrayList = this.f1902d;
            fVar.b((arrayList != null ? arrayList.size() : 0) > 0 && O(this.f1921w));
        }
    }

    public void n(boolean z10, boolean z11) {
        if (z11 && (this.f1919u instanceof d0.b0)) {
            k0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.n(z10, true);
                }
            }
        }
    }

    public void o() {
        for (Fragment fragment : (ArrayList) this.f1901c.f()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public boolean p(MenuItem menuItem) {
        if (this.f1918t < 1) {
            return false;
        }
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void q(Menu menu) {
        if (this.f1918t < 1) {
            return;
        }
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment == null || !fragment.equals(D(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void s(boolean z10, boolean z11) {
        if (z11 && (this.f1919u instanceof d0.c0)) {
            k0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.s(z10, true);
                }
            }
        }
    }

    public boolean t(Menu menu) {
        boolean z10 = false;
        if (this.f1918t < 1) {
            return false;
        }
        for (Fragment fragment : this.f1901c.h()) {
            if (fragment != null && N(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f1921w;
        if (fragment == null) {
            s<?> sVar = this.f1919u;
            if (sVar != null) {
                sb2.append(sVar.getClass().getSimpleName());
                sb2.append("{");
                obj = this.f1919u;
            } else {
                sb2.append("null");
            }
            sb2.append("}}");
            return sb2.toString();
        }
        sb2.append(fragment.getClass().getSimpleName());
        sb2.append("{");
        obj = this.f1921w;
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i10) {
        try {
            this.f1900b = true;
            for (b0 b0Var : this.f1901c.f1995b.values()) {
                if (b0Var != null) {
                    b0Var.f1986e = i10;
                }
            }
            Q(i10, false);
            Iterator it = ((HashSet) e()).iterator();
            while (it.hasNext()) {
                ((l0) it.next()).e();
            }
            this.f1900b = false;
            A(true);
        } catch (Throwable th) {
            this.f1900b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.I) {
            this.I = false;
            j0();
        }
    }

    public void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strA = i.f.a(str, "    ");
        c0 c0Var = this.f1901c;
        Objects.requireNonNull(c0Var);
        String str2 = str + "    ";
        if (!c0Var.f1995b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (b0 b0Var : c0Var.f1995b.values()) {
                printWriter.print(str);
                if (b0Var != null) {
                    Fragment fragment = b0Var.f1984c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = c0Var.f1994a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                Fragment fragment2 = c0Var.f1994a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1903e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                Fragment fragment3 = this.f1903e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f1902d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.a aVar = this.f1902d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.l(strA, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1907i.get());
        synchronized (this.f1899a) {
            int size4 = this.f1899a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    Object obj = (m) this.f1899a.get(i13);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1919u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1920v);
        if (this.f1921w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1921w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1918t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.H);
        if (this.E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.E);
        }
    }

    public final void x() {
        Iterator it = ((HashSet) e()).iterator();
        while (it.hasNext()) {
            ((l0) it.next()).e();
        }
    }

    public void y(m mVar, boolean z10) {
        if (!z10) {
            if (this.f1919u == null) {
                if (!this.H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1899a) {
            if (this.f1919u == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1899a.add(mVar);
                b0();
            }
        }
    }

    public final void z(boolean z10) {
        if (this.f1900b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1919u == null) {
            if (!this.H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1919u.f2110e.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.J == null) {
            this.J = new ArrayList<>();
            this.K = new ArrayList<>();
        }
    }
}
