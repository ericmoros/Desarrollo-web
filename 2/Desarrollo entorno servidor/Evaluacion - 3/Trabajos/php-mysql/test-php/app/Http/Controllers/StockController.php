<?php 

namespace App\Http\Controllers;

use App\Stock;

class StockController extends Controller 
{

  /**
   * Display a listing of the resource.
   *
   * @return Response
   */
  public function index()
  {
    $stock = Stock::all();
    return response()->json($stock, 200);
  }

  /**
   * Show the form for creating a new resource.
   *
   * @return Response
   */
  public function create()
  {
    
  }

  /**
   * Display the specified resource.
   *
   * @param  int  $idTienda
   * @param  int  $idProducto
   * @return Response
   */
  public function show($idTienda = null, $idProducto = null)
  {
    $stock = null;
    if (!is_null($idTienda) && is_null($idProducto)) {
      $stock = Stock::where('tienda', $idTienda)->get();
    } else if (is_null($idTienda) && !is_null($idProducto)) {
      $stock = Stock::where('producto', $idProducto)->get();
    } else {
      $stock = Stock::where('tienda', $idTienda)
        ->where('producto', $idProducto)
        ->get();
    }
    return response()->json($stock, 200);
  }

  /**
   * Update the specified resource in storage.
   *
   * @param  int  $id
   * @return Response
   */
  public function update($id)
  {
    
  }

  /**
   * Remove the specified resource from storage.
   *
   * @param  int  $id
   * @return Response
   */
  public function destroy($id)
  {
    
  }
  
}

?>