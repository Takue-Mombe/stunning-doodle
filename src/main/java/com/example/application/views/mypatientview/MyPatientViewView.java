package com.example.application.views.mypatientview;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("My PatientView")
@Route(value = "my-view5", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class MyPatientViewView extends Composite<VerticalLayout> {

    public MyPatientViewView() {
        H2 h2 = new H2();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        DatePicker datePicker = new DatePicker();
        Hr hr = new Hr();
        H3 h3 = new H3();
        FormLayout formLayout2Col2 = new FormLayout();
        TextField textField4 = new TextField();
        DatePicker datePicker2 = new DatePicker();
        TextArea textArea = new TextArea();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonSecondary = new Button();
        Button buttonPrimary = new Button();
        Button buttonTertiary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h2.setText("My Invoices");
        h2.setWidth("max-content");
        formLayout2Col.setWidth("100%");
        textField.setLabel("Invoice Number");
        textField.setWidth("min-content");
        textField2.setLabel("Amount  Due");
        textField2.setWidth("min-content");
        textField3.setLabel("Payment Method");
        textField3.setWidth("min-content");
        datePicker.setLabel("Due Date");
        datePicker.setWidth("min-content");
        h3.setText("Services Provided");
        h3.setWidth("max-content");
        formLayout2Col2.setWidth("100%");
        textField4.setLabel("Service Type");
        textField4.setWidth("min-content");
        datePicker2.setLabel("Date");
        datePicker2.setWidth("min-content");
        textArea.setLabel("Description");
        textArea.setWidth("100%");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("100px");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonSecondary.setText("Previous");
        buttonSecondary.setWidth("min-content");
        buttonPrimary.setText("Back");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonTertiary.setText("Next");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        getContent().add(h2);
        getContent().add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        formLayout2Col.add(textField3);
        formLayout2Col.add(datePicker);
        getContent().add(hr);
        getContent().add(h3);
        getContent().add(formLayout2Col2);
        formLayout2Col2.add(textField4);
        formLayout2Col2.add(datePicker2);
        formLayout2Col2.add(textArea);
        getContent().add(layoutRow);
        layoutRow.add(buttonSecondary);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonTertiary);
    }
}
