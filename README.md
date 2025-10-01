# 🖥️ Tarea Módulo 2: Paneles y Layouts como profesionales

**📅 Fecha de entrega:** 1 de octubre a las 23:59
**💯 Puntos:** 10

## 📌 Objetivo
Diseñar una interfaz siguiendo un **wireframe** y un árbol de contenedores, usando conscientemente JPanel y layouts:
- BorderLayout
- FlowLayout
- GridLayout
- GridBagLayout
- + JDialog modal

Entregar capturas, esquema y breve explicación (RA1 y RA4).

---

## 📝 Planificación en papel (10 min)
**Ventana: Gestor de usuarios**

### 🖼️ Wireframe
- **Header (NORTH):** título + icono
- **Lateral (WEST):** 5 botones de navegación (Dashboard, Usuarios, Informes, Ajustes, Ayuda)
- **Centro (CENTER):** Formulario con 2 columnas (Nombre, Email, Rol, Activo, Notas)
- **Derecha (EAST):** Previsualización con JTabbedPane (Resumen, Logs)
- **Barra inferior (SOUTH):** botones Cancelar, Limpiar, Guardar alineados a la derecha

### 🌳 Árbol de contenedores
```
JFrame (BorderLayout)
 ├─ NORTH: headerPanel (FlowLayout)
 ├─ WEST: navPanel (GridLayout 5x1)
 ├─ CENTER: formPanel (GridBagLayout)
 ├─ EAST: previewPanel (BorderLayout) → JTabbedPane
 └─ SOUTH: buttonBar (FlowLayout RIGHT)
```

### 🔑 Componentes clave
- Fuentes, tooltips, gaps, insets
- weightx/weighty, fill, anchor

⚠️ Solo pasar a IntelliJ cuando el esquema esté aprobado.

---

## 🛠️ Construcción en IntelliJ GUI Designer

### 1️⃣ Crear formulario y root panel
- New → GUI Form → GestorUsuarios
- Root panel → Right click → Set Layout → BorderLayout

### 2️⃣ Header (NORTH)
- JPanel → NORTH
- Layout: FlowLayout
- JLabel (icono + título) → text="Gestor de usuarios", font=Bold 18, icon opcional
- (Opcional) JSeparator debajo

### 3️⃣ Navegación (WEST)
- JPanel → WEST
- Layout: GridLayout 5x1, vgap=5
- 5 JButton: Dashboard, Usuarios, Informes, Ajustes, Ayuda
- Propiedad: Same Size Horizontally

### 4️⃣ Formulario (CENTER) – GridBagLayout
- JPanel → CENTER
- Layout: GridBagLayout
- Fila 0: JLabel "Nombre" + JTextField (weightx=1, fill=HORIZONTAL, insets=5)
- Fila 1: JLabel "Email" + JTextField
- Fila 2: JLabel "Rol" + JComboBox (Admin, Editor, Invitado)
- Fila 3: JLabel "Activo" + JCheckBox
- Fila 4: JLabel "Notas" + JScrollPane con JTextArea (weighty=1, fill=BOTH)
- Alineación de etiquetas: anchor=WEST

### 5️⃣ Previsualización (EAST)
- JPanel → EAST → BorderLayout
- JTabbedPane → CENTER
  - Pestaña 1: "Resumen" → JTextArea readOnly dentro de JScrollPane
  - Pestaña 2: "Logs" → JTextArea o JList
- Preferred size ≈ 260px ancho

### 6️⃣ Botonera (SOUTH)
- JPanel → SOUTH → FlowLayout RIGHT
- JButton: Cancelar, Limpiar, Guardar
- Same Size Horizontally
- Default Button: Guardar (opcional)

---

## 🔔 Diálogo modal de confirmación (JDialog)
- GUI Form → DialogConfirmacion
- JLabel: "¿Guardar cambios?"
- JButton: Aceptar, Cancelar
- Mostrar al pulsar Guardar:
```java
dialog.setModal(true);
dialog.pack();
dialog.setVisible(true);
```

---

## ⚙️ Ajustes de comportamiento
- GridLayoutManager: Size Policy = Can grow, usar weightx/weighty en GridBagLayout
- FlowLayout: respetar tamaño preferido
- BorderLayout: CENTER crece, EAST/WEST conservan preferred width
- Para mover componentes: Ctrl+X → panel destino → Ctrl+V

---

## 📷 Entrega
- Wireframe dibujado (foto o escaneo)
- Árbol de contenedores con layouts y justificación
- Capturas:
  - Vista general
  - Redimensionada
  - Pestañas del JTabbedPane
  - Diálogo modal abierto
- Mini tabla con propiedades clave (insets, weightx, fill, alignment)
- Enlace GitHub con .form, .java y PDF planificación

---

## 🏆 Criterios de evaluación (10 pts)
- **3 pts:** Estructura/layouts elegidos (Border, Flow, Grid, GridBag)
- **3 pts:** Uso de propiedades de distribución (insets, hgap/vgap, anchor, fill, weightx/y, preferred size)
- **2 pts:** Comportamiento al redimensionar (CENTER y Notas crecen, EAST estable, botonera alineada)
- **2 pts:** Presentación/README: wireframe, árbol de paneles, capturas, explicación

---

## ✨ Retos opcionales
- Añadir JMenuBar arriba (Archivo/Editar/Ayuda)
- Botonera en GridLayout(1,3) comparado con Flow RIGHT
- Formulario solo GridBag con gridwidth=2 para Notas

---

## 📌 Chuleta rápida IntelliJ GUI Designer
- Cambiar layout: Right click panel → Set Layout
- Mover componente: Ctrl+X → panel destino → Ctrl+V
- Igualar tamaños: Same Size Horizontally/Vertically
- Márgenes: insets (GridBag) o border/margin del panel
- Espaciados: hgap, vgap (Flow/Grid)
- Hacer crecer campos: GridBag → weightx=1, fill=HORIZONTAL/BOTH

