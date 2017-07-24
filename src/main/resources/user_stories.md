# Szenario: Obst-Onlineversand mit verschiedenen Obstsorten

In unserem Obst-Online-Versand werden verschiedene Obstsorten angeboten. Jede Obstsorte hat einen Preis in Cents und ein Gewicht in Gramm. Diese kann ein Kunden in einen Warenkorb legen. Wenn er zur Kasse geht, wird ein Preis für diesen Warenkorb ermittelt.

## Obstsorten

* Äpfel: 50 Ct, 50g
* Birnen: 70 Ct, 70g
* Wassermelonen: 300 Ct, 3000g

### Obstsalat
Zusätzlich wird noch ein Obstsalat bestehend aus 1 Apfel, 1 Birne, 1 Wassermelone angeboten zum Preis von 399 Ct

## Preis des Warenkorbs
Der Gesamtpreis eines Warenkorbs ergibt sich als Addition der Einzelpreise.
Der Einzelpreis eines Produkts ist normalerweise der Preis pro Einheit x Menge. 

## User Stories
1. Als Ladenbesitzer möchte ich mein bisheriges Sortiment um Birnen erweitern.
2. Als Ladenbesitzer möchte ich, dass bis zu einem Bestellwert von 1000 Ct ein Porto von 400 Ct fällig wird.
4. Als Ladenbesitzer möchte ich mein bisheriges Sortiment um Wassermelone erweitern.
5. Als Ladenbesitzer möchte ich, dass ab einem Gewicht von 5kg ein Porto von 500 Ct auf den Preis aufgeschlagen wird, weil ich die Portokosten für Wassermelonen auf meine Kunden umlegen möchte.
6. Als Ladenbesitzer möchte ich, dass für Birnen der Preis ab der fünften Birne auf 60 Ct für jede weitere Birne reduziert wird.
7. Als Ladenbesitzer möchte ich, dass beim Kauf von Wassermelonen jede vierte umsonst ist, d.h. für 4 Wassermelonen wird der Preis von 3 berechnet.
8. Als Ladenbesitzer möchte ich, dass beim Kauf von je 1 Menge Äpfeln, Birnen, Wassermelonen der Preis von Obstsalat berechnet wird. Dieser hat Vorrang vor den anderen Rabatten. Der restliche Warenkorb wird nach den anderen Rabatten bepreist.