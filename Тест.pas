
uses GraphABC;
var
  x,y:integer;
 
procedure KeyDown(Key: integer);
begin
   case Key of
  VK_Left:  drawCircle(x-20,y,100);
  VK_Right: drawCircle(x+20,y,100);
  VK_Up:    drawCircle(x,y-20,100);
  VK_Down:  drawCircle(x,y+20,100);
  VK_space: Clear;
   end;
end;
 
begin
  x:=300;
  y:=200;
  OnKeyDown := KeyDown;
end.