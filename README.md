# 🖥️ Ejercicio Tema 2: Paneles y Layouts como profesionales

Este proyecto consiste en diseñar una **interfaz gráfica** a partir de un wireframe y un árbol de contenedores, usando **JPanel** y diferentes **layouts** de Swing en Java.  
Se practican **BorderLayout, FlowLayout, GridLayout y GridBagLayout** en una sola ventana y un **JDialog modal**.

---

## 🎯 Objetivos

- Elegir conscientemente cuántos JPanel usar y qué layout conviene en cada zona.  
- Construir una ventana “Gestor de usuarios” fiel al wireframe.  
- Practicar **propiedades de distribución**: insets, weightx/weighty, fill, anchor, alignment.  
- Crear un diálogo modal de confirmación (sin lógica aún).

---

## 📝 Planificación

### 1️⃣ Boceto y árbol de contenedores

**Wireframe de la ventana “Gestor de usuarios”**:

- **Header (NORTH)**: título + icono  
- **Navegación (WEST)**: 5 botones (Dashboard, Usuarios, Informes, Ajustes, Ayuda)  
- **Formulario (CENTER)**: etiquetas + campos (Nombre, Email, Rol, Activo, Notas)  
- **Previsualización (EAST)**: `JTabbedPane` con pestañas “Resumen” y “Logs”  
- **Botonera (SOUTH)**: Cancelar, Limpiar, Guardar, alineados a la derecha  

**Árbol de contenedores**:

```
JFrame (BorderLayout)
 ├─ NORTH: headerPanel (FlowLayout)
 ├─ WEST: navPanel (GridLayout 5x1)
 ├─ CENTER: formPanel (GridBagLayout)
 ├─ EAST: previewPanel (BorderLayout) → JTabbedPane
 └─ SOUTH: buttonBar (FlowLayout RIGHT)
```

**Propiedades clave**: fuentes, tooltips, gaps, insets, alignment, fill, weightx/weighty.

---

## 🛠️ Construcción en IntelliJ GUI Designer

### Header (NORTH)
- JPanel → FlowLayout  
- JLabel con icono + texto: `"Gestor de usuarios"`, fuente **Bold 18**  
- Opcional: `JSeparator` debajo

### Navegación (WEST)
- JPanel → GridLayout 5x1, vgap=5  
- 5 JButton: Dashboard, Usuarios, Informes, Ajustes, Ayuda  
- Propiedad: **Same Size Horizontally**  

### Formulario (CENTER) – GridBagLayout
- Columnas de etiquetas y campos  
- Campos: `JTextField`, `JComboBox`, `JCheckBox`, `JTextArea` en `JScrollPane`  
- Insets: 5px, anchor=WEST, fill HORIZONTAL/BOTH, weightx=1, weighty=1 en Notas

### Previsualización (EAST)
- JPanel → BorderLayout  
- `JTabbedPane` con:
  - **Resumen** → JTextArea readOnly + JScrollPane  
  - **Logs** → JTextArea o JList  
- Preferred Size: 260px de ancho

### Botonera (SOUTH)
- JPanel → FlowLayout RIGHT  
- Botones: Cancelar, Limpiar, Guardar  
- Propiedad: Same Size Horizontally  
- Default Button = Guardar (opcional)

### Diálogo modal de confirmación (JDialog)
- JLabel: “¿Guardar cambios?”  
- Botones: Aceptar, Cancelar  
- Abrir desde el JFrame:  
```java
dialog.setModal(true);
dialog.pack();
dialog.setVisible(true);
```

---

## 📷 Capturas y entrega

- Wireframe dibujado (foto/escaneo)  
- Árbol de contenedores con layouts  
- Vista general de la ventana  
- Redimensionada (CENTER y Notas crecen)  
- Pestañas del JTabbedPane  
- Diálogo modal abierto  
- Mini tabla con propiedades clave (insets, weightx, fill, alignment…)  
- Enlace a GitHub con `.form`, `.java` y PDF de planificación

---

## ✅ Criterios de evaluación (10 pts)

- **Estructura / layouts** (3 pts): Border + Flow + Grid + GridBag correctamente  
- **Propiedades de distribución** (3 pts): insets, hgap/vgap, anchor, fill, weightx/weighty, preferred size  
- **Comportamiento al redimensionar** (2 pts): CENTER y Notas crecen, EAST estable, botonera alineada  
- **Presentación / README** (2 pts): wireframe, árbol de paneles, capturas y explicación

---

## 🎯 Retos opcionales

- Añadir un **JMenuBar** (Archivo / Editar / Ayuda)  
- Cambiar botonera a `GridLayout(1,3)` y compararla con Flow RIGHT  
- Formulario solo con GridBagLayout y gridwidth=2 para Notas  

---

## ⚡ Chuleta rápida IntelliJ GUI Designer

- Cambiar layout: Right click panel → Set Layout  
- Mover componente: Ctrl+X → panel destino → Ctrl+V  
- Igualar tamaños: Same Size Horizontally/Vertically  
- Márgenes: Insets o Border  
- Espaciados: hgap, vgap  
- Campos que crecen: GridBag → weightx=1, fill=HORIZONTAL/BOTH
