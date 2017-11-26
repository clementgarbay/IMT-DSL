# A DSL for browser automation

## Choices

### Auxiliary functions
Sometimes, it is required to use auxiliary functions that can be called from `main`.
Here is a real life example :
```
def checkPrintable(name) {
  go "http://www.imt-atlantique.fr/fr"
  click a[text=name]
  assign img[alt="Imprimer"] imageImprimer
  assert body[].html contains imageImprimer
} 
def main {
  openBrowser "firefox"
  checkPrintable("COMMUNIQUÉS DE PRESSE")
  checkPrintable("DOSSIERS DE PRESSE")
  checkPrintable("VISUELS POUR LA PRESSE")
  checkPrintable("LA PRESSE EN PARLE")
  checkPrintable("TRIBUNES DE PRESSE")
  checkPrintable("LES PALMARÈS")
}
```
In that case, 


## DSL syntax

### Selector

> `<HTML TAG>`[`<HTML ATTRIBUTE>*`]

Returns the first DOM element matching conditions.

To retrieve all elements matching conditions add `.all` extension.

| Elements  |   |          
| -         | - |
| HTML tag | `button`, `a`, `body`, `checkbox`, `input`, `img`, ... |
| HTML attribute | `href`, `text`, `class`, `id`, `checked`, ... |

#### Examples

```
a[text="Toutes les actualités"]
div[id="test", class="views-row"]
img[alt="Accueil"]
div[class="views-row"].all
```

### Projection

> `<SELECTOR>`.`<ATTRIBUTE>` 

| Elements  |   |          
| -         | - |
| Attribute | `value`, `html`, `count`, ... |

Apply a projection to a selector.

#### Examples

```
body[].html
p[].value
div[class="views-row"].all.count
```

### Action

> `<ACTION>` `<SELECTOR>` `<PARAMETERS>*` 

| Elements  |   |          
| -         | - |
| Action | `click`, `fill`, `choose`, ... |

Proceed to an action on a specific selector.

#### Examples

```
click checkbox[checked="true"].all
click button[text="Appliquer les filtres"]
choose select[] [text="Le mois dernier"]
fill input[type="text"] "2007"
```

### Assignment

> assign `<*>` `<VARIABLE>`

Assign an element (selector, string, ...) to a new variable.

#### Examples

```
assign 3 nbResults
assign img[alt="Imprimer"] imageImprimer
```

### Navigation

> `<ACTION>` `<STRING>`

| Elements  |   |          
| -         | - |
| Action | `openBrowser`, `go` |

#### Examples

```
openBrowser "firefox"
go "http://www.imt-atlantique.fr/fr/rechercher"
```

### Function

> def `<FUNCTION NAME>`(`<FUNCTION PARAMETER>*`) { `<STATEMENTS>` }

Define a function containing multiple statements.

A function auto-returns the result of the last statement.

#### Examples

```
def countResults() {
  div[class="views-row"].all.count
}
```

### Assertion

> assert `<ELEMENT>` = `<ELEMENT>`

> assert `<ELEMENT>` contains `<ELEMENT>`

Assert that a condition is true.

### Full example

```
def checkPrintable(name) {
  go "http://www.imt-atlantique.fr/fr"
  click a[text=name]
  assign img[alt="Imprimer"] imageImprimer
  assert body[].html contains imageImprimer
  click imageImprimer
}
def main {
  openBrowser "firefox"
  checkPrintable("COMMUNIQUÉS DE PRESSE")
  checkPrintable("DOSSIERS DE PRESSE")
}
```