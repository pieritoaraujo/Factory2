### Factory Method - Planes de Datos

#### Descripción

Implemente el patrón de diseño Factory Method para la creación de planes de datos ofrecidos por diferentes proveedores de telefonía.

Los proveedores son:
- Línea Rápida
- Claro
- Movistar

Cada proveedor ofrece tres tipos de planes:
- Personal
- Académico
- Negocio

Cada plan posee una tasa de pago distinta, la cual es utilizada para calcular el costo total del consumo de datos.
#### Creator
- `ProveedorFactory`
#### Concrete Creators
- `LineaRapidaProveedor`
- `ClaroProveedor`
- `MovistarProveedor`

#### Product
- `PlanDatos`

#### Concrete Products
- `PlanDatosPersonal`
- `PlanDatosAcademico`
- `PlanDatosNegocio`

#### Funcionamiento

El usuario selecciona un proveedor y un tipo de plan.
El proveedor correspondiente crea el objeto adecuado y asigna la tasa correspondiente al plan.
Posteriormente se calcula el costo total según la cantidad de megabytes consumidos.

#### Autor

`Piero Araujo`