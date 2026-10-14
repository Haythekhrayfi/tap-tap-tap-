package gb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.Scopes;
import com.zipoapps.premiumhelper.ui.support.ContactSupportActivity;
import fd.g0;
import fd.j0;
import fd.s0;
import fd.s1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f30383a = new q();

    @oc.e(c = "com.zipoapps.premiumhelper.util.ContactSupport$openEmailApp$1", f = "ContactSupport.kt", l = {46, 54}, m = "invokeSuspend")
    public static final class a extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f30386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f30387f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f30388g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f30389h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f30390i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f30391j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f30392k;

        /* JADX INFO: renamed from: gb.q$a$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.premiumhelper.util.ContactSupport$openEmailApp$1$1", f = "ContactSupport.kt", l = {}, m = "invokeSuspend")
        public static final class C0279a extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Activity f30393c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Intent f30394d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Uri f30395e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0279a(Activity activity, Intent intent, Uri uri, mc.d<? super C0279a> dVar) {
                super(2, dVar);
                this.f30393c = activity;
                this.f30394d = intent;
                this.f30395e = uri;
            }

            @Override // oc.a
            public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
                return new C0279a(this.f30393c, this.f30394d, this.f30395e, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
                C0279a c0279a = new C0279a(this.f30393c, this.f30394d, this.f30395e, dVar);
                jc.w wVar = jc.w.f31842a;
                c0279a.invokeSuspend(wVar);
                return wVar;
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                h9.d.t(obj);
                try {
                    this.f30393c.startActivity(this.f30394d);
                    ma.h.f33410y.a().j();
                } catch (ActivityNotFoundException unused) {
                    Activity activity = this.f30393c;
                    Uri uri = this.f30395e;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setDataAndType(uri, "application/zip");
                    try {
                        activity.startActivity(intent);
                        ma.h.f33410y.a().j();
                    } catch (ActivityNotFoundException e10) {
                        xe.a.f37601c.c(e10);
                    }
                }
                return jc.w.f31842a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, String str, String str2, String str3, mc.d<? super a> dVar) {
            super(2, dVar);
            this.f30389h = activity;
            this.f30390i = str;
            this.f30391j = str2;
            this.f30392k = str3;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return new a(this.f30389h, this.f30390i, this.f30391j, this.f30392k, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
            return new a(this.f30389h, this.f30390i, this.f30391j, this.f30392k, dVar).invokeSuspend(jc.w.f31842a);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x010f  */
        /* JADX WARN: Code duplicated, block: B:51:0x011a  */
        /* JADX WARN: Code duplicated, block: B:54:0x011e  */
        /* JADX WARN: Code duplicated, block: B:59:0x0129  */
        /* JADX WARN: Code duplicated, block: B:61:0x012c  */
        /* JADX WARN: Code duplicated, block: B:62:0x012e  */
        /* JADX WARN: Code duplicated, block: B:63:0x0130 A[PHI: r2
  0x0130: PHI (r2v7 java.util.List<android.content.pm.ResolveInfo>) = (r2v6 java.util.List<android.content.pm.ResolveInfo>), (r2v10 java.util.List<android.content.pm.ResolveInfo>) binds: [B:52:0x011b, B:62:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            List<ResolveInfo> listQueryIntentActivities;
            List<ResolveInfo> listQueryIntentActivities2;
            boolean z10;
            List list;
            boolean z11;
            q qVar;
            Context context;
            Object objA;
            boolean z12;
            nc.a aVar;
            Intent intentCreateChooser;
            nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30388g;
            String str2 = "android.intent.extra.SUBJECT";
            if (i10 != 0) {
                if (i10 == 1) {
                    context = (Context) this.f30387f;
                    qVar = (q) this.f30386e;
                    list = (List) this.f30385d;
                    str = (String) this.f30384c;
                    h9.d.t(obj);
                    objA = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                return jc.w.f31842a;
            }
            h9.d.t(obj);
            str = "I have an issue with " + com.zipoapps.premiumhelper.util.c.e(this.f30389h) + ' ' + com.zipoapps.premiumhelper.util.c.l(this.f30389h);
            Activity activity = this.f30389h;
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:test@gmail.com"));
            intent.putExtra("android.intent.extra.EMAIL", "test@gmail.com");
            intent.putExtra("android.intent.extra.SUBJECT", "this is a test");
            try {
                listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
            } catch (Throwable unused) {
                listQueryIntentActivities = kc.w.f32009c;
            }
            try {
                PackageManager packageManager = activity.getPackageManager();
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setData(Uri.parse("mailto:"));
                intent2.setType("vnd.android.cursor.dir/email");
                intent2.putExtra("android.intent.extra.EMAIL", new String[]{"test@gmail.com"});
                intent2.putExtra("android.intent.extra.SUBJECT", "Test");
                listQueryIntentActivities2 = packageManager.queryIntentActivities(intent2, 0);
            } catch (Throwable unused2) {
                listQueryIntentActivities2 = kc.w.f32009c;
            }
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                if (listQueryIntentActivities2 != null || listQueryIntentActivities2.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (listQueryIntentActivities != null || listQueryIntentActivities.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        listQueryIntentActivities2 = kc.w.f32009c;
                        list = listQueryIntentActivities2;
                    } else {
                        list = listQueryIntentActivities;
                    }
                } else {
                    list = listQueryIntentActivities2;
                }
            } else if (listQueryIntentActivities2 == null || listQueryIntentActivities2.isEmpty()) {
                if (listQueryIntentActivities2 != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (listQueryIntentActivities != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        list = listQueryIntentActivities;
                    } else {
                        listQueryIntentActivities2 = kc.w.f32009c;
                        list = listQueryIntentActivities2;
                    }
                } else {
                    list = listQueryIntentActivities2;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = false;
                            break;
                        }
                        if (j0.d(resolveInfo.activityInfo.packageName, it.next().activityInfo.packageName)) {
                            z12 = true;
                            break;
                        }
                    }
                    if (z12) {
                        arrayList.add(resolveInfo);
                    }
                }
                list = arrayList;
            }
            qVar = q.f30383a;
            context = this.f30389h;
            this.f30384c = str;
            this.f30385d = list;
            this.f30386e = qVar;
            this.f30387f = context;
            this.f30388g = 1;
            objA = q.a(qVar, context, this);
            if (objA == aVar2) {
                return aVar2;
            }
            Objects.requireNonNull(qVar);
            Uri uriB = FileProvider.a(context, context.getPackageName() + ".com.zipoapps.premiumhelper.share", 0).b((File) objA);
            j0.h(uriB, "{\n            FileProvid…r.share\", file)\n        }");
            if (!list.isEmpty()) {
                String str3 = this.f30390i;
                String str4 = this.f30391j;
                if (str4 != null && ma.h.f33410y.a().i()) {
                    str3 = str4;
                }
                String str5 = this.f30392k;
                ArrayList arrayList2 = new ArrayList();
                new Intent("android.intent.action.SEND").setType("vnd.android.cursor.dir/email");
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) it2.next();
                    String str6 = resolveInfo2.activityInfo.packageName;
                    Iterator it3 = it2;
                    Intent intent3 = new Intent("android.intent.action.SEND");
                    intent3.setType("vnd.android.cursor.dir/email");
                    intent3.putExtra(str2, str);
                    nc.a aVar3 = aVar2;
                    String str7 = str2;
                    intent3.putExtra("android.intent.extra.EMAIL", new String[]{str3});
                    if (str5 != null) {
                        intent3.putExtra("android.intent.extra.TEXT", str5);
                    }
                    intent3.setPackage(str6);
                    intent3.addFlags(1);
                    intent3.putExtra("android.intent.extra.STREAM", uriB);
                    ActivityInfo activityInfo = resolveInfo2.activityInfo;
                    intent3.setClassName(activityInfo.packageName, activityInfo.name);
                    arrayList2.add(intent3);
                    it2 = it3;
                    aVar2 = aVar3;
                    str2 = str7;
                }
                aVar = aVar2;
                intentCreateChooser = Intent.createChooser((Intent) arrayList2.remove(0), "");
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList2.toArray(new Intent[0]));
            } else {
                aVar = aVar2;
                String str8 = this.f30390i;
                String str9 = this.f30391j;
                if (str9 == null || !ma.h.f33410y.a().i()) {
                    str9 = str8;
                }
                if (str9 != null && ma.h.f33410y.a().i()) {
                    str8 = str9;
                }
                String str10 = this.f30392k;
                Intent intent4 = new Intent("android.intent.action.SEND");
                intent4.setData(Uri.parse("mailto:"));
                intent4.setType("vnd.android.cursor.dir/email");
                intent4.putExtra("android.intent.extra.EMAIL", new String[]{str8});
                intent4.putExtra("android.intent.extra.SUBJECT", str);
                if (str10 != null) {
                    intent4.putExtra("android.intent.extra.TEXT", str10);
                }
                intent4.addFlags(1);
                intent4.putExtra("android.intent.extra.STREAM", uriB);
                intentCreateChooser = intent4;
            }
            fd.c0 c0Var = s0.f29619a;
            s1 s1Var = kd.q.f32064a;
            C0279a c0279a = new C0279a(this.f30389h, intentCreateChooser, uriB, null);
            this.f30384c = null;
            this.f30385d = null;
            this.f30386e = null;
            this.f30387f = null;
            this.f30388g = 2;
            nc.a aVar4 = aVar;
            if (y8.c0.V(s1Var, c0279a, this) == aVar4) {
                return aVar4;
            }
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(q qVar, Context context, mc.d dVar) throws Throwable {
        r rVar;
        Context context2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        Objects.requireNonNull(qVar);
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f30401h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f30401h = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(qVar, dVar);
            }
        } else {
            rVar = new r(qVar, dVar);
        }
        Object obj = rVar.f30399f;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = rVar.f30401h;
        if (i11 != 0) {
            if (i11 == 1) {
                arrayList = (ArrayList) rVar.f30398e;
                arrayList2 = (ArrayList) rVar.f30397d;
                context2 = (Context) rVar.f30396c;
                h9.d.t(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) rVar.f30396c;
                h9.d.t(obj);
            }
            return new File(str);
        }
        h9.d.t(obj);
        ArrayList arrayList3 = new ArrayList();
        rVar.f30396c = context;
        rVar.f30397d = arrayList3;
        rVar.f30398e = arrayList3;
        rVar.f30401h = 1;
        Object objV = y8.c0.V(s0.f29620b, new p(context, null), rVar);
        if (objV == aVar) {
            return aVar;
        }
        context2 = context;
        arrayList = arrayList3;
        obj = objV;
        arrayList2 = arrayList;
        arrayList.add(((File) obj).getAbsolutePath());
        String[] list = context2.getFilesDir().list(f5.j.f29288d);
        if (list != null) {
            for (String str2 : list) {
                arrayList2.add(context2.getFilesDir() + '/' + str2);
            }
        }
        str = context2.getFilesDir() + "/info.zip";
        rVar.f30396c = str;
        rVar.f30397d = null;
        rVar.f30398e = null;
        rVar.f30401h = 2;
        Object objV2 = y8.c0.V(s0.f29620b, new f0(str, arrayList2, null), rVar);
        if (objV2 != nc.a.COROUTINE_SUSPENDED) {
            objV2 = jc.w.f31842a;
        }
        if (objV2 == aVar) {
            return aVar;
        }
        return new File(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Activity activity, String str, String str2, String str3) {
        j0.i(activity, "activity");
        j0.i(str, Scopes.EMAIL);
        if (activity instanceof androidx.lifecycle.p) {
            y8.c0.z(androidx.activity.i.l((androidx.lifecycle.p) activity), null, null, new a(activity, str, str2, str3, null), 3, null);
        }
    }

    public static final void c(Activity activity, String str, String str2) {
        if (!((Boolean) ma.h.f33410y.a().f33418g.h(oa.b.S)).booleanValue()) {
            b(activity, str, str2, null);
            return;
        }
        Objects.requireNonNull(ContactSupportActivity.f28423f);
        Intent intent = new Intent(activity, (Class<?>) ContactSupportActivity.class);
        intent.putExtra(Scopes.EMAIL, str);
        if (str2 != null) {
            intent.putExtra("email_vip", str2);
        }
        activity.startActivity(intent);
    }
}
