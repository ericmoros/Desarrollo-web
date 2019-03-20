{!! Form::open(array('route' => 'route.name', 'method' => 'POST')) !!}
	<ul>
		<li>
			{!! Form::label('cod', 'Cod:') !!}
			{!! Form::text('cod') !!}
		</li>
		<li>
			{!! Form::label('nombre', 'Nombre:') !!}
			{!! Form::text('nombre') !!}
		</li>
		<li>
			{!! Form::label('tlf', 'Tlf:') !!}
			{!! Form::text('tlf') !!}
		</li>
		<li>
			{!! Form::submit() !!}
		</li>
	</ul>
{!! Form::close() !!}