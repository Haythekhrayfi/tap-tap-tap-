package p0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.inscode.autoclicker.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: renamed from: p0.a$a, reason: collision with other inner class name */
    public static final class C0382a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f34335a;

        public C0382a(a aVar) {
            this.f34335a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f34335a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            q0.d accessibilityNodeProvider = this.f34335a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.f34766a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f34335a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object objValueOf;
            int iKeyAt;
            q0.c cVar = new q0.c(accessibilityNodeInfo);
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            int i10 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i10 >= 28) {
                tag = Boolean.valueOf(e0.m.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            boolean z10 = bool != null && bool.booleanValue();
            if (i10 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z10);
            } else {
                cVar.l(1, z10);
            }
            if (i10 >= 28) {
                objValueOf = Boolean.valueOf(e0.m.c(view));
            } else {
                Object tag2 = view.getTag(R.id.tag_accessibility_heading);
                objValueOf = Boolean.class.isInstance(tag2) ? tag2 : null;
            }
            Boolean bool2 = (Boolean) objValueOf;
            boolean z11 = bool2 != null && bool2.booleanValue();
            if (i10 >= 28) {
                accessibilityNodeInfo.setHeading(z11);
            } else {
                cVar.l(2, z11);
            }
            CharSequence charSequenceG = e0.g(view);
            if (i10 >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequenceG);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceG);
            }
            if (i10 >= 30) {
                objA = e0.o.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_state_description);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            CharSequence charSequence = (CharSequence) objA;
            if (i10 >= 30) {
                accessibilityNodeInfo.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f34335a.onInitializeAccessibilityNodeInfo(view, cVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i10 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        if (((WeakReference) sparseArray.valueAt(i11)).get() == null) {
                            arrayList.add(Integer.valueOf(i11));
                        }
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        sparseArray.remove(((Integer) arrayList.get(i12)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArrF = q0.c.f(text);
                if (clickableSpanArrF != null && clickableSpanArrF.length > 0) {
                    cVar.h().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i13 = 0; i13 < clickableSpanArrF.length; i13++) {
                        ClickableSpan clickableSpan = clickableSpanArrF[i13];
                        int i14 = 0;
                        while (true) {
                            if (i14 >= sparseArray2.size()) {
                                iKeyAt = q0.c.f34745d;
                                q0.c.f34745d = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i14)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArrF[i13]));
                        ClickableSpan clickableSpan2 = clickableSpanArrF[i13];
                        Spanned spanned = (Spanned) text;
                        cVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        cVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        cVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        cVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    }
                }
            }
            List<q0.c.a> actionList = a.getActionList(view);
            for (int i15 = 0; i15 < actionList.size(); i15++) {
                cVar.a(actionList.get(i15));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f34335a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f34335a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f34335a.performAccessibilityAction(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f34335a.sendAccessibilityEvent(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f34335a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(DEFAULT_DELEGATE);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0382a(this);
    }

    public static List<q0.c.a> getActionList(View view) {
        List<q0.c.a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrF = q0.c.f(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrF != null && i10 < clickableSpanArrF.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrF[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public q0.d getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.mOriginalDelegate, view);
        if (accessibilityNodeProviderA != null) {
            return new q0.d(accessibilityNodeProviderA);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, cVar.f34746a);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        q0.g.a aVarNewInstance;
        Exception e10;
        List<q0.c.a> actionList = getActionList(view);
        boolean zB = false;
        for (int i11 = 0; i11 < actionList.size(); i11++) {
            q0.c.a aVar = actionList.get(i11);
            if (aVar.a() == i10) {
                if (aVar.f34763d == null) {
                    break;
                }
                q0.g.a aVar2 = null;
                Class<? extends q0.g.a> cls = aVar.f34762c;
                if (cls != null) {
                    try {
                        aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            Objects.requireNonNull(aVarNewInstance);
                        } catch (Exception e11) {
                            e10 = e11;
                            Class<? extends q0.g.a> cls2 = aVar.f34762c;
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                        }
                    } catch (Exception e12) {
                        aVarNewInstance = null;
                        e10 = e12;
                    }
                    aVar2 = aVarNewInstance;
                }
                zB = aVar.f34763d.perform(view, aVar2);
                break;
            }
        }
        if (!zB) {
            zB = b.b(this.mOriginalDelegate, view, i10, bundle);
        }
        return (zB || i10 != R.id.accessibility_action_clickable_span || bundle == null) ? zB : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(View view, int i10) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i10);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
