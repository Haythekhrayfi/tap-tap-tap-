package p7;

import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONObject;
import y9.o8;
import y9.t1;
import y9.t2;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    private static final String AUTHORITY_HIDE_TOOLTIP = "hide_tooltip";
    private static final String AUTHORITY_SET_VARIABLE = "set_variable";
    private static final String AUTHORITY_SHOW_TOOLTIP = "show_tooltip";
    private static final String AUTHORITY_SWITCH_STATE = "set_state";
    private static final String AUTHORITY_TIMER = "timer";
    private static final String AUTHORITY_VIDEO = "video";
    private static final String PARAM_ACTION = "action";
    private static final String PARAM_ID = "id";
    private static final String PARAM_STATE_ID = "state_id";
    private static final String PARAM_TEMPORARY = "temporary";
    private static final String PARAM_VARIABLE_NAME = "name";
    private static final String PARAM_VARIABLE_VALUE = "value";
    private static final String SCHEME_DIV_ACTION = "div-action";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:114:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:203:0x0350  */
    /* JADX WARN: Multi-variable type inference failed */
    private boolean handleAction(Uri uri, f1 f1Var) {
        View viewFindViewWithTag;
        String queryParameter;
        r8.a aVar;
        r8.a aVar2;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        StringBuilder sbA;
        String str;
        String str2;
        StringBuilder sbA2;
        String str3;
        String queryParameter5;
        String authority = uri.getAuthority();
        boolean z10 = true;
        if (AUTHORITY_SWITCH_STATE.equals(authority)) {
            String queryParameter6 = uri.getQueryParameter(PARAM_STATE_ID);
            if (queryParameter6 == null) {
                return false;
            }
            try {
                f1Var.c(c8.e.e(queryParameter6), uri.getBooleanQueryParameter(PARAM_TEMPORARY, true));
                return true;
            } catch (c8.i unused) {
                return false;
            }
        }
        if (AUTHORITY_SHOW_TOOLTIP.equals(authority)) {
            String queryParameter7 = uri.getQueryParameter("id");
            if (queryParameter7 == null) {
                return false;
            }
            f1Var.e(queryParameter7);
            return true;
        }
        if (AUTHORITY_HIDE_TOOLTIP.equals(authority)) {
            String queryParameter8 = uri.getQueryParameter("id");
            if (queryParameter8 == null) {
                return false;
            }
            f1Var.h(queryParameter8);
            return true;
        }
        r8.b eVar = null;
        jc.w wVar = null;
        if (AUTHORITY_SET_VARIABLE.equals(authority)) {
            String queryParameter9 = uri.getQueryParameter("name");
            if (queryParameter9 == null || (queryParameter5 = uri.getQueryParameter("value")) == null) {
                return false;
            }
            i8.k kVar = f1Var instanceof i8.k ? (i8.k) f1Var : null;
            if (kVar == null) {
                f1Var.getClass();
                return false;
            }
            try {
                kVar.z(queryParameter9, queryParameter5);
                return true;
            } catch (w8.f e10) {
                e10.getMessage();
                return false;
            }
        }
        if (!AUTHORITY_TIMER.equals(authority)) {
            if (AUTHORITY_VIDEO.equals(authority)) {
                i8.k kVar2 = f1Var instanceof i8.k ? (i8.k) f1Var : null;
                if (kVar2 == null || (queryParameter2 = uri.getQueryParameter("id")) == null || (queryParameter3 = uri.getQueryParameter(PARAM_ACTION)) == null) {
                    return false;
                }
                return kVar2.n(queryParameter2, queryParameter3);
            }
            fd.j0.i(authority, "authority");
            int iHashCode = authority.hashCode();
            if ((iHashCode == -1789088446 ? authority.equals("set_next_item") : iHashCode == -1280379330 ? authority.equals("set_previous_item") : iHashCode == -88123690 && authority.equals("set_current_item")) != true) {
                return false;
            }
            fd.j0.i(uri, "uri");
            fd.j0.i(f1Var, "view");
            String queryParameter10 = uri.getQueryParameter("id");
            if (queryParameter10 == null || (viewFindViewWithTag = f1Var.getView().findViewWithTag(queryParameter10)) == null) {
                return false;
            }
            String authority2 = uri.getAuthority();
            r8.b.a aVar3 = r8.b.f35288a;
            v9.d expressionResolver = f1Var.getExpressionResolver();
            fd.j0.h(expressionResolver, "view.expressionResolver");
            Objects.requireNonNull(aVar3);
            r8.b.a aVar4 = r8.b.f35288a;
            if (viewFindViewWithTag instanceof o8.m) {
                o8.m mVar = (o8.m) viewFindViewWithTag;
                t2 div = mVar.getDiv();
                fd.j0.f(div);
                int i10 = r8.b.a.C0400a.f35289a[div.f42730x.b(expressionResolver).ordinal()];
                if (i10 == 1) {
                    if (fd.j0.d(authority2, "set_previous_item")) {
                        aVar = r8.a.PREVIOUS;
                    } else {
                        fd.j0.d(authority2, "set_next_item");
                        aVar = r8.a.NEXT;
                    }
                    eVar = new r8.b.C0401b(mVar, aVar);
                } else {
                    if (i10 != 2) {
                        throw new jc.g();
                    }
                    if (fd.j0.d(authority2, "set_previous_item")) {
                        aVar2 = r8.a.PREVIOUS;
                    } else {
                        fd.j0.d(authority2, "set_next_item");
                        aVar2 = r8.a.NEXT;
                    }
                    eVar = new r8.b.d(mVar, aVar2);
                }
            } else if (viewFindViewWithTag instanceof o8.l) {
                eVar = new r8.b.c((o8.l) viewFindViewWithTag);
            } else if (viewFindViewWithTag instanceof t9.t) {
                eVar = new r8.b.e((t9.t) viewFindViewWithTag);
            }
            if (eVar == null) {
                return false;
            }
            if (authority2 == null) {
                z10 = false;
            } else {
                int iHashCode2 = authority2.hashCode();
                if (iHashCode2 != -1789088446) {
                    if (iHashCode2 != -1280379330) {
                        if (iHashCode2 == -88123690 && authority2.equals("set_current_item") && (queryParameter = uri.getQueryParameter("item")) != null) {
                            try {
                                eVar.c(Integer.parseInt(queryParameter));
                            } catch (NumberFormatException unused2) {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    } else if (authority2.equals("set_previous_item")) {
                        eVar.c(x1.q.b(uri, eVar.a(), eVar.b()).b());
                    } else {
                        z10 = false;
                    }
                } else if (authority2.equals("set_next_item")) {
                    eVar.c(x1.q.b(uri, eVar.a(), eVar.b()).a());
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
        String queryParameter11 = uri.getQueryParameter("id");
        if (queryParameter11 == null || (queryParameter4 = uri.getQueryParameter(PARAM_ACTION)) == null) {
            return false;
        }
        i8.k kVar3 = f1Var instanceof i8.k ? (i8.k) f1Var : null;
        if (kVar3 == null) {
            f1Var.getClass();
            return false;
        }
        fd.j0.i(queryParameter11, "id");
        fd.j0.i(queryParameter4, "command");
        d8.a divTimerEventDispatcher$div_release = kVar3.getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            fd.j0.i(queryParameter11, "id");
            fd.j0.i(queryParameter4, "command");
            d8.j jVarB = divTimerEventDispatcher$div_release.b(queryParameter11);
            if (jVarB != null) {
                fd.j0.i(queryParameter4, "command");
                String str4 = "' already stopped!";
                switch (queryParameter4) {
                    case "cancel":
                        jVarB.f28898j.a();
                        break;
                    case "resume":
                        d8.d dVar = jVarB.f28898j;
                        int i11 = d8.d.c.f28874a[dVar.f28868k.ordinal()];
                        if (i11 != 1) {
                            if (i11 == 2) {
                                sbA = defpackage.a.a("The timer '");
                                str = dVar.f28858a;
                                str2 = "' already working!";
                            } else if (i11 == 3) {
                                dVar.f28868k = d8.d.b.WORKING;
                                dVar.f28871n = -1L;
                                dVar.g();
                            }
                            break;
                        } else {
                            sbA = defpackage.a.a("The timer '");
                            str = dVar.f28858a;
                            str2 = "' is stopped!";
                        }
                        i.a(sbA, str, str2, dVar);
                        break;
                    case "stop":
                        d8.d dVar2 = jVarB.f28898j;
                        int i12 = d8.d.c.f28874a[dVar2.f28868k.ordinal()];
                        if (i12 == 1) {
                            i.a(defpackage.a.a("The timer '"), dVar2.f28858a, "' already stopped!", dVar2);
                        } else if (i12 == 2 || i12 == 3) {
                            dVar2.f28868k = d8.d.b.STOPPED;
                            dVar2.f28861d.invoke(Long.valueOf(dVar2.d()));
                            dVar2.b();
                            dVar2.f();
                        }
                        break;
                    case "pause":
                        d8.d dVar3 = jVarB.f28898j;
                        int i13 = d8.d.c.f28874a[dVar3.f28868k.ordinal()];
                        if (i13 != 1) {
                            if (i13 == 2) {
                                dVar3.f28868k = d8.d.b.PAUSED;
                                dVar3.f28859b.invoke(Long.valueOf(dVar3.d()));
                                dVar3.h();
                                dVar3.f28870m = -1L;
                            } else if (i13 == 3) {
                                sbA2 = defpackage.a.a("The timer '");
                                str3 = dVar3.f28858a;
                                str4 = "' already paused!";
                            }
                            break;
                        } else {
                            sbA2 = defpackage.a.a("The timer '");
                            str3 = dVar3.f28858a;
                        }
                        i.a(sbA2, str3, str4, dVar3);
                        break;
                    case "reset":
                        d8.d dVar4 = jVarB.f28898j;
                        dVar4.a();
                        dVar4.k();
                        break;
                    case "start":
                        jVarB.f28898j.k();
                        break;
                    default:
                        jVarB.f28891c.a(new IllegalArgumentException(fd.j0.p(queryParameter4, " is unsupported timer command!")));
                        break;
                }
                wVar = jc.w.f31842a;
            }
            if (wVar == null) {
                divTimerEventDispatcher$div_release.f28847a.a(new IllegalArgumentException(androidx.activity.j.a("Timer with id '", queryParameter11, "' does not exist!")));
            }
        }
        return true;
    }

    public boolean getUseActionUid() {
        return false;
    }

    public boolean handleAction(o8 o8Var, f1 f1Var, String str) {
        return handleAction(o8Var, f1Var);
    }

    public boolean handleAction(y9.q qVar, f1 f1Var, String str) {
        return handleAction(qVar, f1Var);
    }

    public final boolean handleActionUrl(Uri uri, f1 f1Var) {
        if (uri != null && SCHEME_DIV_ACTION.equals(uri.getScheme())) {
            return handleAction(uri, f1Var);
        }
        return false;
    }

    public void handlePayload(JSONObject jSONObject) {
    }

    @Deprecated
    public boolean handleUri(Uri uri, f1 f1Var) {
        return handleActionUrl(uri, f1Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean handleAction(y9.q qVar, f1 f1Var) {
        v9.b<Uri> bVar = qVar.f42101f;
        Uri uriB = bVar != null ? bVar.b(f1Var.getExpressionResolver()) : null;
        if (s7.b.a(uriB, f1Var)) {
            i8.k kVar = (i8.k) f1Var;
            fd.j0.i(qVar, PARAM_ACTION);
            fd.j0.i(kVar, "view");
            v9.b<Uri> bVar2 = qVar.f42101f;
            Uri uriB2 = bVar2 != null ? bVar2.b(kVar.getExpressionResolver()) : null;
            if (uriB2 == null) {
                return false;
            }
            t1 t1Var = qVar.f42096a;
            String queryParameter = uriB2.getQueryParameter(ImagesContract.URL);
            if (queryParameter == null) {
                return false;
            }
            s7.i aVar = new s7.a(kVar, t1Var);
            s7.e eVar = ((r7.a.b) kVar.getDiv2Component$div_release()).f35197a.f34546n;
            Objects.requireNonNull(eVar, "Cannot return null from a non-@Nullable @Provides method");
            z7.e eVarA = eVar.a(kVar, queryParameter, aVar);
            fd.j0.h(eVarA, "loadRef");
            kVar.m(eVarA, kVar);
            return true;
        }
        return handleActionUrl(uriB, f1Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean handleAction(o8 o8Var, f1 f1Var) {
        v9.b<Uri> bVar = o8Var.f41859f;
        Uri uriB = bVar != null ? bVar.b(f1Var.getExpressionResolver()) : null;
        if (s7.b.a(uriB, f1Var)) {
            i8.k kVar = (i8.k) f1Var;
            fd.j0.i(o8Var, PARAM_ACTION);
            fd.j0.i(kVar, "view");
            v9.b<Uri> bVar2 = o8Var.f41859f;
            Uri uriB2 = bVar2 != null ? bVar2.b(kVar.getExpressionResolver()) : null;
            if (uriB2 == null) {
                return false;
            }
            t1 t1Var = o8Var.f41854a;
            String queryParameter = uriB2.getQueryParameter(ImagesContract.URL);
            if (queryParameter == null) {
                return false;
            }
            s7.i aVar = new s7.a(kVar, t1Var);
            s7.e eVar = ((r7.a.b) kVar.getDiv2Component$div_release()).f35197a.f34546n;
            Objects.requireNonNull(eVar, "Cannot return null from a non-@Nullable @Provides method");
            z7.e eVarA = eVar.a(kVar, queryParameter, aVar);
            fd.j0.h(eVarA, "loadRef");
            kVar.m(eVarA, kVar);
            return true;
        }
        return handleActionUrl(uriB, f1Var);
    }
}
