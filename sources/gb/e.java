package gb;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import fd.g0;
import fd.j0;
import fd.s0;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma.f f30198b;

    @oc.e(c = "com.zipoapps.premiumhelper.util.AppInstanceId$get$2", f = "AppInstanceId.kt", l = {43}, m = "invokeSuspend")
    public static final class a extends oc.h implements uc.p<g0, mc.d<? super String>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30200d;

        /* JADX INFO: renamed from: gb.e$a$a, reason: collision with other inner class name */
        public static final class C0276a<TResult> implements OnCompleteListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f30202a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fd.i<String> f30203b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0276a(e eVar, fd.i<? super String> iVar) {
                this.f30202a = eVar;
                this.f30203b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x005a  */
            /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<String> task) {
                String string;
                String str;
                j0.i(task, "it");
                if (task.isSuccessful()) {
                    string = task.getResult();
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        str = "randomUUID().toString()";
                    }
                    xe.a.b("PremiumHelper").g(i.f.a("APPLICATION_INSTANCE_ID = ", string), new Object[0]);
                    ma.f fVar = this.f30202a.f30198b;
                    Objects.requireNonNull(fVar);
                    SharedPreferences.Editor editorEdit = fVar.f33405a.edit();
                    editorEdit.putString("app_instance_id", string);
                    editorEdit.apply();
                    if (this.f30203b.a()) {
                        fd.i<String> iVar = this.f30203b;
                        jc.i.a aVar = jc.i.f31813c;
                        iVar.resumeWith(string);
                    }
                }
                string = UUID.randomUUID().toString();
                str = "{\n                      …                        }";
                j0.h(string, str);
                xe.a.b("PremiumHelper").g(i.f.a("APPLICATION_INSTANCE_ID = ", string), new Object[0]);
                ma.f fVar2 = this.f30202a.f30198b;
                Objects.requireNonNull(fVar2);
                SharedPreferences.Editor editorEdit2 = fVar2.f33405a.edit();
                editorEdit2.putString("app_instance_id", string);
                editorEdit2.apply();
                if (this.f30203b.a()) {
                    fd.i<String> iVar2 = this.f30203b;
                    jc.i.a aVar2 = jc.i.f31813c;
                    iVar2.resumeWith(string);
                }
            }
        }

        public a(mc.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super String> dVar) {
            return e.this.new a(dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            Task taskForException;
            ExecutorService executorService;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30200d;
            if (i10 == 0) {
                h9.d.t(obj);
                String string = e.this.f30198b.f33405a.getString("app_instance_id", null);
                if (!(string == null || string.length() == 0)) {
                    return string;
                }
                e eVar = e.this;
                this.f30199c = eVar;
                this.f30200d = 1;
                fd.k kVar = new fd.k(nc.b.c(this), 1);
                kVar.u();
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(eVar.f30197a);
                Objects.requireNonNull(firebaseAnalytics);
                try {
                    synchronized (FirebaseAnalytics.class) {
                        if (firebaseAnalytics.f12557b == null) {
                            firebaseAnalytics.f12557b = new x4.a(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                        }
                        executorService = firebaseAnalytics.f12557b;
                    }
                    taskForException = Tasks.call(executorService, new com.google.firebase.analytics.a(firebaseAnalytics));
                } catch (RuntimeException e10) {
                    firebaseAnalytics.f12556a.zzA(5, "Failed to schedule task for getAppInstanceId", null, null, null);
                    taskForException = Tasks.forException(e10);
                }
                taskForException.addOnCompleteListener(new C0276a(eVar, kVar));
                obj = kVar.r();
                nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return (String) obj;
        }
    }

    public e(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f30197a = context;
        this.f30198b = new ma.f(context);
    }

    public final Object a(mc.d<? super String> dVar) {
        return y8.c0.V(s0.f29620b, new a(null), dVar);
    }
}
