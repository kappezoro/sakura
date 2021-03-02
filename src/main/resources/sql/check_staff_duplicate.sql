select
    count(1)
from
    staff
group by
    name
having
    count(1) > 1;