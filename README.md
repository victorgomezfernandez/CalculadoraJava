# CalculadoraJava

CalculadoraJava es una aplicación extremadamente simple realizada en Android Studio usando el lenguaje de programación Java y una interfaz realizada mediante un archivo *.xml*. El objetivo de la aplicación es el aprendizaje de las herramientas utilizadas y tener cierta experiencia en la creación de aplicaciones móviles.

## Interfaz .xml

Se ha modificado el archivo *.xml* incluido en la aplicación para acomodarlo a la simple calculadora. Se han añadido dos campos de texto editable, un botón de suma y una línea de texto para el resultado. El código utilizado en dicho archivo es el siguiente:

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/firstNumberField"
        android:layout_width="281dp"
        android:layout_height="55dp"
        android:ems="10"
        android:inputType="number"
        android:maxLength="5"
        android:textAlignment="center"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.084" />

    <EditText
        android:id="@+id/secondNumberField"
        android:layout_width="281dp"
        android:layout_height="55dp"
        android:ems="10"
        android:inputType="number"
        android:maxLength="5"
        android:textAlignment="center"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.288" />

    <Button
        android:id="@+id/addButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="+"
        android:onClick="addNumbers"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.19" />

    <TextView
        android:id="@+id/resultLabel"
        android:layout_width="142dp"
        android:layout_height="50dp"
        android:text="Result"
        android:textAlignment="center"
        android:textSize="34sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Interfaz en el dispositivo

Dicho código *.xml* desembocará en la siguiente interfaz gráfica en los dispositivos Android:
![imagen](https://github.com/user-attachments/assets/80663d2b-c82f-4a15-98cf-5107b35d495b)


## Método addNumbers

Es el único método añadido en el archivo *MainActivity.java*, y será llamado por el botón para la suma de los valores introducidos en los campos de texto:
```java
public void addNumbers(View view){
        EditText firstNumberField = (EditText)findViewById(R.id.firstNumberField);
        String firstNumberString = String.valueOf(firstNumberField.getText());
        int firstNumber;
        if(firstNumberString.length()>0){
            firstNumber = Integer.parseInt(String.valueOf(firstNumberField.getText()));
        } else {
            firstNumber = 0;
        }
        EditText secondNumberField = (EditText)findViewById(R.id.secondNumberField);
        String secondNumberString = String.valueOf(secondNumberField.getText());
        int secondNumber;
        if(secondNumberString.length()>0){
            secondNumber = Integer.parseInt(String.valueOf(secondNumberField.getText()));
        } else {
            secondNumber = 0;
        }
        TextView resultLabel = (TextView)findViewById(R.id.resultLabel);
        int resultNumber = firstNumber + secondNumber;
        String resultString = String.valueOf(resultNumber);
        resultLabel.setText(resultString);
    }
```

## Creado por Víctor Gómez
