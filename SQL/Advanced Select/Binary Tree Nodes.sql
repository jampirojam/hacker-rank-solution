# Soal 22 - JAMPIROJAM
select BinaryTurunan.N,
case
  when BinaryTurunan.P is NULL then 'Root'
  when EXISTS (select BinaryPindahan.P from BST BinaryPindahan where BinaryPindahan.P = BinaryTurunan.N) then 'Inner'        
  else 'Leaf'
end
from BST as BinaryTurunan order by BinaryTurunan.N;
