package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.inscode.autoclicker.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f545m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f553u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f554v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f557y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f558z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f546n = false;
    public int B = 0;
    public int I = -1;
    public final View.OnClickListener R = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f560d;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f28478t);
            this.f560d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f559c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            if ((view != alertController.f547o || (message2 = alertController.f549q) == null) && (view != alertController.f551s || (message2 = alertController.f553u) == null)) {
                messageObtain = (view != alertController.f555w || (message = alertController.f557y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.Q.obtainMessage(1, alertController2.f534b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public boolean[] E;
        public boolean F;
        public boolean G;
        public DialogInterface.OnMultiChoiceClickListener I;
        public Cursor J;
        public String K;
        public String L;
        public AdapterView.OnItemSelectedListener M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f563b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CharSequence f568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f569h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Drawable f570i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f571j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f572k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Drawable f573l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public DialogInterface.OnClickListener f574m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f575n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Drawable f576o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public DialogInterface.OnClickListener f577p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public DialogInterface.OnCancelListener f579r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnDismissListener f580s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnKeyListener f581t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public CharSequence[] f582u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ListAdapter f583v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public DialogInterface.OnClickListener f584w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f585x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public View f586y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f587z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f564c = 0;
        public boolean D = false;
        public int H = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f578q = true;

        public b(Context context) {
            this.f562a = context;
            this.f563b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f588a;

        public c(DialogInterface dialogInterface) {
            this.f588a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f588a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, o oVar, Window window) {
        this.f533a = context;
        this.f534b = oVar;
        this.f535c = window;
        this.Q = new c(oVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.a.f28463e, R.attr.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f536d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        oVar.supportRequestWindowFeature(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.Q.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f556x = charSequence;
            this.f557y = messageObtainMessage;
            this.f558z = drawable;
        } else if (i10 == -2) {
            this.f552t = charSequence;
            this.f553u = messageObtainMessage;
            this.f554v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f548p = charSequence;
            this.f549q = messageObtainMessage;
            this.f550r = drawable;
        }
    }

    public void e(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }
}
